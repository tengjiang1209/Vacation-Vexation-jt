package com.teng.controller.chatroom.socket;

import com.alibaba.fastjson.JSON;
import com.teng.domain.MsgContent;
import com.teng.util.SocketEncoder;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(value = "/crserver",encoders = {SocketEncoder.class})
@Component
public class ChatRoomSocket {

    // 登录用户名
    private String userName;
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;
    //concurrent包的线程安全Set，用来存放每个客户端对应的ChatRoomSocket对象。
    private static CopyOnWriteArraySet<ChatRoomSocket> webSocketSet = new CopyOnWriteArraySet<ChatRoomSocket>();
    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        webSocketSet.add(this);     //加入set中
        addOnlineCount();           //在线数加1
        broadcast(new MsgContent("1",getOnlineCount()));
        System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
    }

    @OnClose
    public void onClose() {
        webSocketSet.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
        broadcast(new MsgContent("1",getOnlineCount()));
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    @OnMessage
    public void onMessage(String msgContent, Session session) throws IOException {
          System.out.println("来自客户端的消息:" + msgContent);
            System.out.println(JSON.parseObject(msgContent,MsgContent.class));
          broadcast(JSON.parseObject(msgContent,MsgContent.class));
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }


    public void sendMessage(MsgContent msgContent) throws IOException, EncodeException {
//        this.session.getBasicRemote().sendText(message);
        System.out.println("发送消息："+msgContent.toString());
        this.session.getBasicRemote().sendObject(msgContent);
    }

    public static void broadcast(MsgContent msgContent) {
        for (ChatRoomSocket socket : webSocketSet) {
            try {
                socket.sendMessage(msgContent);
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }
    public static synchronized void addOnlineCount() {
        ChatRoomSocket.onlineCount++;
    }
    public static synchronized void subOnlineCount() {
        ChatRoomSocket.onlineCount--;
    }


}

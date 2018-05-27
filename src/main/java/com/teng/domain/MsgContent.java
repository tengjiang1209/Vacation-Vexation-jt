package com.teng.domain;

import java.util.Objects;

/**
 * 聊天室信息封装类
 */

public class MsgContent {

    private String chatRoomId;   // 聊天室ID
    private String username;     // 用户名
    private String msg;          // 聊天信息
    private String type;         // 信息类型 1、状态(加入聊天室状态，聊天室人数改变) 2、文字，3、图片，4、视频，5、表情,
    private String headImgUrl;   // 用户头像Url
    private int count;           // 聊天室人数

    public MsgContent(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public MsgContent(String chatRoomId, String username, String msg, String type, String headImgUrl, int count) {
        this.chatRoomId = chatRoomId;
        this.username = username;
        this.msg = msg;
        this.type = type;
        this.headImgUrl = headImgUrl;
        this.count = count;
    }

    public String getChatRoomId() {
        return chatRoomId;
    }

    public void setChatRoomId(String chatRoomId) {
        this.chatRoomId = chatRoomId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MsgContent{");
        sb.append("chatRoomId='").append(chatRoomId).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", headImgUrl='").append(headImgUrl).append('\'');
        sb.append(", count='").append(count).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

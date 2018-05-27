package com.teng.util;

import com.alibaba.fastjson.JSON;
import com.teng.domain.MsgContent;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class SocketEncoder implements Encoder.Text<MsgContent> {
    @Override
    public String encode(MsgContent msgContent) throws EncodeException {
        return JSON.toJSONString(msgContent);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}

package com.teng.controller.chatroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chatRoom")
public class ChatRoomController {

    @RequestMapping
    public String index() {
        return "chatRoom/index";
    }
}

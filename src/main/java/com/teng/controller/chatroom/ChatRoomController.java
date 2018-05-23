package com.teng.controller.chatroom;

import com.teng.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chatRoom")
public class ChatRoomController extends BaseController{

    @RequestMapping
    public String index() {
        return "chatRoom/index";
    }
}

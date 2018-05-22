package com.teng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class V2Controller extends  BaseController{

    @RequestMapping(value="index")
    public String index(){
        return "index";
    }


}

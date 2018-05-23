package com.teng.controller.community;

import com.teng.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("community")
public class CommunityController extends BaseController{

    @RequestMapping
    public String index() {
        return "community/index";
    }
}

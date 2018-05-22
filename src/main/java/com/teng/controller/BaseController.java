package com.teng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Component
public class BaseController {

    @Value("${jt.thymeleaf.layout.path}")
    private String layoutPath;

    @ModelAttribute
    public void layoutUrl(Model model){
        model.addAttribute("layoutPath",layoutPath);
    }
}

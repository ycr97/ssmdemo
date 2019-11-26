package com.yy.controller;

import com.yy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("users", service.getAll());
        return "/list";
    }

}

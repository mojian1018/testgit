package com.demo.demo25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloGit {

    @RequestMapping("index.html")
    public String helloGits(){

        return "index";
    }

    @RequestMapping("login.html")
    public String login(){
        //这是dev创建的方法
        System.out.println("hello git");
        System.out.println("dev");
        return "login";
    }
}

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
        System.out.println("master");
        System.out.println("dev");
        //你的代码写的不错
        System.out.println("hello github");
        System.out.println("我的线下添加的内容");
        return "login";
    }
}

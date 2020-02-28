package com.banyechan.nacos.provide_server1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {


    @RequestMapping("/index")
    public String home() {
        String result = "服务提供者。。。";
        return result;
    }


}

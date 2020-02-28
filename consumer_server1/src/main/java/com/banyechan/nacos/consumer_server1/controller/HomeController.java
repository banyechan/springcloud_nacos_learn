package com.banyechan.nacos.consumer_server1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String getHome() {
        String result = "welcome to  consumer_serve1 home index";
        return result;
    }

}

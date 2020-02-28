package com.banyechan.nacos.provide_server2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String getHome() {
        String result = "welcome to  provide_serve2 home index";
        return result;
    }


}

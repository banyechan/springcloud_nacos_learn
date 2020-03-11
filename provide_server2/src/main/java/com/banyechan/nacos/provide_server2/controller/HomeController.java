package com.banyechan.nacos.provide_server2.controller;

import com.banyechan.nacos.server_feign.provide_server1.RemoteHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private RemoteHomeService remoteHomeService;

    @RequestMapping("/index")
    public String getHome() {
        String result = "welcome to  provide_serve2 home index";
        return result;
    }


    @RequestMapping("/feign")
    public String feignTest() {
        String result = remoteHomeService.home();
        return result;
    }
}

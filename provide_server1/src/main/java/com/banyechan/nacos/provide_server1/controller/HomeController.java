package com.banyechan.nacos.provide_server1.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@RequestMapping("/home")
public class HomeController {

    @NacosValue(value = "banyechan.nacos.message", autoRefreshed = true)
    private String message;


    @Value("${banyechan.nacos.message}")
    private String message2;

    @RequestMapping("/index")
    public String home() {
        String result = "server1服务提供者。。。";
        return result;
    }

    @RequestMapping("/config")
    public String configRefresh() {
        String result = message;
        result = result + "----" + message2;
        return result;
    }


}

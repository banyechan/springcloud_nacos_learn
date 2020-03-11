package com.banyechan.nacos.provide_server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.banyechan.nacos.provide_server2", "com.banyechan.nacos.server_feign"})
@EnableFeignClients(value = {"com.banyechan.nacos.server_feign"})
public class ProvideServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProvideServer2Application.class, args);
    }

}

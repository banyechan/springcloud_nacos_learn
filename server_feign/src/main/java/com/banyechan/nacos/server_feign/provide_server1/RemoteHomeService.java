package com.banyechan.nacos.server_feign.provide_server1;


import com.banyechan.nacos.server_feign.provide_server1.fallback.RemoteHomeServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provide-server1", path = "/home",
        fallback = RemoteHomeServiceFallback.class)
public interface RemoteHomeService {

    @RequestMapping("/index")
    String home();

}

package com.banyechan.nacos.server_feign.provide_server1.fallback;

import com.banyechan.nacos.server_feign.provide_server1.RemoteHomeService;
import org.springframework.stereotype.Component;

@Component
public class RemoteHomeServiceFallback implements RemoteHomeService {


    @Override
    public String home() {
        String message = "熔断降级处理...";
        return message;
    }
}

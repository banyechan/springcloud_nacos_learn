package com.banyechan.nacos.consumer_server1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServer1Application.class, args);
    }


//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }
//
//    @GetMapping("/consumer")
//    public String test() {
//        return restTemplate.getForObject("http://nacos-provide/helloNacos",String.class);
//    }
}

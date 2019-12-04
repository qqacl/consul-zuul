package com.wyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableHystrix
//@EnableCircuitBreaker //熔断器
public class Consul01App {

    public static void main(String[] args) {
        SpringApplication.run(Consul01App.class);
    }

    @RequestMapping("/testHelth")
    public String testHelth(){
        System.out.println("============testHelth=============");
        return "test01-ok";
    }

}

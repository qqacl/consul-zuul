package com.wyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Consul02App {

    public static void main(String[] args) {
        SpringApplication.run(Consul02App.class);
    }

    @RequestMapping("/testHelth")
    public String testHelth(){
        System.out.println("----*-----testHelth-----*-----");
        return "test02-ok";
    }

}

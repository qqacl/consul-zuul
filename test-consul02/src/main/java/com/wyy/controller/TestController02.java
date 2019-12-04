package com.wyy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController02 {

    @RequestMapping("test01")
    public String test01(String name){
        System.out.println("==========name========"+name);
        if ("1".equals(name)){
            throw new RuntimeException("========error========");
        }
        return name;
    }


}

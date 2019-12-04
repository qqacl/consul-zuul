package com.wyy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wyy.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController01 {

    @Autowired
    TestApi testApi;

    //@PathVariable是spring3.0的一个新功能：接收请求路径中占位符的值
    @RequestMapping("test02/{name}")
    @HystrixCommand(fallbackMethod = "testerror")  //熔断的第二种方式,需在启动类上加 @EnableHystrix 注解
    public String test01(@PathVariable String name){
        return testApi.test01(name);
    }

    public String testerror(String name){
        return "出错了---"+name;
    }

}

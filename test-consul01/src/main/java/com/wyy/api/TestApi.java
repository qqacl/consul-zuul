package com.wyy.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//服务熔断:①使用Hystrix的注解@HystrixCommand, ②使用spring cloud 的feign组件。
// 由于Feign已经集成了hystrix，只需要在Feign接口上添加@FeignClient，然后在后面的参数中配置降级类就可以,
// @FeignClient(fallback=XXXX.class)，表示通过feign调用微服务失败了以后，走XXXX类里面的降级的方法
//服务降级的意思，就是服务在熔断之后，进入降级的方法，返回其它的结果，比如，返回一些友好的访问失败信息

@FeignClient(name = "ribbon-server02")
//@FeignClient(name = "ribbon-server02",fallback = TestFallBackFactory.class)
//@Hystrix
public interface TestApi {

    @RequestMapping("/test01")
    public String test01(@RequestParam(value = "name") String name);

}

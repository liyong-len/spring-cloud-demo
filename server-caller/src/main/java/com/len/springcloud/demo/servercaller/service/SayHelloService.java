package com.len.springcloud.demo.servercaller.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SayHelloService
 * @Description SayHelloService
 * @Author liyong
 * @Date 2020/7/24 14:43
 * @Version 1.0
 */
@FeignClient(name = "SERVER-PROVIDER")
public interface SayHelloService {


    /**
     * 欢迎页面
     *
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    String say(@RequestParam("name") String name);

}

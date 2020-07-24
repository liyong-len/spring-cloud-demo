package com.len.springcloud.demo.servercaller.controller;

import com.len.springcloud.demo.servercaller.service.SayHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName PersonController
 * @Description PersonController
 * @Author liyong
 * @Date 2020/7/24 14:49
 * @Version 1.0
 */
@Controller
public class PersonController {
    @Resource
    private SayHelloService sayHelloService;

    @RequestMapping("/sayhello")
    @HystrixCommand(fallbackMethod = "requestFallBack")
    @ResponseBody
    public String sayHi(@RequestParam("name") String name) {
        return "server-caller：" + sayHelloService.say(name);
    }

    /**
     * 熔断后调用方法
     *
     * @return
     */
    public String requestFallBack(String name) {
        return "抱歉" + name + ",请求繁忙，请稍后再试！";
    }
}

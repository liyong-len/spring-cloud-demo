package com.len.springcloud.server.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName SayHelloController
 * @Description SayHelloController
 * @Author liyong
 * @Date 2020/7/24 14:42
 * @Version 1.0
 */
@Controller
public class SayHelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam("name") String name) {
        return name + ", hello";
    }
}

package com.len.demo.aop;

import com.len.demo.aop.annotation.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LogController
 * @Description LogController
 * @Author liyong
 * @Date 2020/8/24 11:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/log")
public class LogController {

    @Log(description = "这是接口的请求说明")
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public void getLogInfo(@RequestParam("name") String name, @RequestParam("age") String age) {
        System.out.println("接口请求成功");
    }
}

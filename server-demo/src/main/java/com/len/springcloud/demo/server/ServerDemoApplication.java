package com.len.springcloud.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerDemoApplication.class, args);
    }

}

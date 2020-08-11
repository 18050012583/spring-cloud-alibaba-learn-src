package com.example.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${user.name}")
    private String userName;

    @RequestMapping("/hello")
    public String hello() {
        return "hello:" + userName;
    }
}

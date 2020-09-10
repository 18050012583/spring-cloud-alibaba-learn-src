package com.example.alibaba.controller;

import com.example.alibaba.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/api1/message1")
    public String message1() {
        return "message1";
    }

    @RequestMapping("/api1/message2")
    public String message2() {
        return "message2";
    }

    @RequestMapping("/api2/demo1")
    public String demo1() {
        return "demo1";
    }

    @RequestMapping("/api2/demo2")
    public String demo2() {
        return "demo2";
    }
}

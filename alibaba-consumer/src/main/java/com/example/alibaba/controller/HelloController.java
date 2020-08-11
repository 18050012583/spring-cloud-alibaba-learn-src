package com.example.alibaba.controller;

import com.example.alibaba.feign.HelloFacade;
import com.example.alibaba.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(final HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.hello();
        return hello;
    }
}

package com.example.alibaba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sentinel 测试
 */

@RestController
public class SentinelController {

    @RequestMapping("/hello1")
    public String hello1() {
        return "hello sentinel";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello java";
    }
}

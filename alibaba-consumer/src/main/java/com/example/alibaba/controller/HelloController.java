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

    @RequestMapping("/test")
    public String hello() {
        String msg = helloService.hello();
        if(msg.equals("error")) {
            return "error...";
        }
        //模拟调用alibaba-provider微服务需要2s的时间
//        try {
//            Thread.sleep(2000l);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return msg;
    }

    //测试高并发
    @RequestMapping("/hello2")
    public String message() {
        return "测试高并发";
    }
}

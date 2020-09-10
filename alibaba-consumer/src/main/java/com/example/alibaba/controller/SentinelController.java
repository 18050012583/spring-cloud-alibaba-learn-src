package com.example.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.alibaba.service.BlockHandlerImpl;
import com.example.alibaba.service.FallbackImpl;
import com.example.alibaba.service.SentinelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class SentinelController {

    @Resource
    private SentinelService sentinelService;

    int i = 0;

    @RequestMapping("/hello/message1")
    public String message1() {
        sentinelService.message();
//        异常模拟
//        i ++ ;
//        if(i % 3 == 0) {
//            throw new RuntimeException();
//        }
        return "hello message1";
    }

    @RequestMapping("/hello/message2")
    public String message2() {
        sentinelService.message();
        return "hello message2";
    }

    @RequestMapping("/hello/message3")
    @SentinelResource("message3") // 此处必须加，否则热点规则不生效
    public String message3(String name,Integer age) {
        return "hello message3," + "name:" + name + "age:" + age;
    }

    @RequestMapping("/hello/message4")
    @SentinelResource(value = "message4",
            blockHandlerClass = BlockHandlerImpl.class,
            blockHandler = "blockHandler",
            fallbackClass = FallbackImpl.class,
            fallback = "fallback")
    public String message4() {
        return "hello message4";
    }

}

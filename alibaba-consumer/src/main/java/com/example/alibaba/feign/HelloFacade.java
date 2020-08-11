package com.example.alibaba.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "alibaba-provider")
public interface HelloFacade {

    @RequestMapping("/hello")
    String hello();
}

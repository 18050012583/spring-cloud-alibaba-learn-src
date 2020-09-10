package com.example.alibaba.feign;

import com.example.alibaba.fallback.HelloFacadeFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "alibaba-provider",fallback = HelloFacadeFallbackImpl.class)
public interface HelloFacade {

    @RequestMapping("/hello")
    String hello();
}

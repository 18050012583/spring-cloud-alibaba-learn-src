package com.example.alibaba.fallback;

import com.example.alibaba.feign.HelloFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * feign容错类，实现HelloFacade接口
 */
@Component
@Slf4j
public class HelloFacadeFallbackImpl implements HelloFacade {
    @Override
    public String hello() {
        return "error";
    }
}

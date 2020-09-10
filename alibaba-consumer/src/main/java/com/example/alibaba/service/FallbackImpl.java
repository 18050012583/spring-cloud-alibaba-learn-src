package com.example.alibaba.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
public class FallbackImpl {

    public static String fallback(Throwable e) {
        log.error(e.getLocalizedMessage(),e);
        return "接口异常";
    }
}

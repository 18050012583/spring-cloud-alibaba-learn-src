package com.example.alibaba.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;


@Service
public class SentinelService {

    @SentinelResource("message")
    public String message() {
        return "message";
    }
}

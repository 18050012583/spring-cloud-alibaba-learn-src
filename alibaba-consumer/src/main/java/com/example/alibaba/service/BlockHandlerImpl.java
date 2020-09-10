package com.example.alibaba.service;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
public class BlockHandlerImpl {

    public static String blockHandler(BlockException e) {
        log.error(e.getLocalizedMessage(),e);
        return "接口被限流或者降级了";
    }
}

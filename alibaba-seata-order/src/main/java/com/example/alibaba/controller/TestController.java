package com.example.alibaba.controller;

import com.example.alibaba.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RedisTemplate<Object, Order> redisTemplate;

    @GetMapping("/order/save")
    public Order save() {
        Order order = new Order();
        order.setId(1);
        redisTemplate.opsForValue().set("order",order);
        return redisTemplate.opsForValue().get("order");
    }
}

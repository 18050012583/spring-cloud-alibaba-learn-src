package com.example.alibaba.controller;

import com.example.alibaba.entity.Order;
import com.example.alibaba.repository.OrderRepository;
import com.example.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/add")
    public String create(Order order){
        orderService.add(order);
        return "添加成功";
    }
}

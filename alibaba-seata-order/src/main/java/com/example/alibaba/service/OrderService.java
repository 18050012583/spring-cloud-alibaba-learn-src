package com.example.alibaba.service;

import com.example.alibaba.entity.Order;
import com.example.alibaba.feign.AccountService;
import com.example.alibaba.feign.StoreService;
import com.example.alibaba.repository.OrderRepository;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;
    @Resource
    private StoreService storeService;
    @Resource
    private AccountService accountService;

    @GlobalTransactional(name = "my-create-order",rollbackFor = Exception.class)
    public void add(Order order) {
        order.setStatus(0); //初始状态
        orderRepository.save(order);
        storeService.decrease(order.getProductId(),order.getCount());
        accountService.decrease(order.getUserId(),order.getMoney());
        order.setStatus(1);
        orderRepository.save(order);
    }

}

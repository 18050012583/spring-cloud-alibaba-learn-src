package com.example.alibaba.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "alibaba-seata-store")
public interface StoreService {

    @RequestMapping(value = "/store/decrease")
    String decrease(@RequestParam("productId") Integer productId, @RequestParam("count")Integer count);
}

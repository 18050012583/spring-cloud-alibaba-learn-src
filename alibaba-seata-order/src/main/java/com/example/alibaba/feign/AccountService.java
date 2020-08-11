package com.example.alibaba.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "alibaba-seata-account")
public interface AccountService {

    @RequestMapping(value = "/account/decrease")
    String decrease(@RequestParam("userId")Long userId, @RequestParam("money")  BigDecimal money);

}

package com.example.alibaba.controller;

import com.example.alibaba.entity.Account;
import com.example.alibaba.repository.AccountRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(final AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(value = "/account/decrease")
    public boolean decrease(Integer userId, BigDecimal money){
        Account account = accountRepository.findByUserId(userId);
        account.setTotal(account.getTotal().subtract(money));
        accountRepository.save(account);
//        int i= 1/0;
        return true;
    }
}

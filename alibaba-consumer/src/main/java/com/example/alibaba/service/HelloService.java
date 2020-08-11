package com.example.alibaba.service;

import com.example.alibaba.feign.HelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private final HelloFacade helloFacade;

    public HelloService(final HelloFacade helloFacade){
        this.helloFacade = helloFacade;
    }

    public String hello() {
        return helloFacade.hello();
    }
}

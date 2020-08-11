package com.example.alibaba.controller;

import com.example.alibaba.entity.Store;
import com.example.alibaba.repository.StoreRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    private final StoreRepository storeRepository;

    public StoreController(final StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @RequestMapping(value = "/store/decrease")
    public boolean decrease(Long productId, Integer count){
        Store store = storeRepository.findByProductId(productId);
        store.setTotal(store.getTotal() - count);
        storeRepository.save(store);
        return true;
    }
}

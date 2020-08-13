package com.example.alibaba.repository;

import com.example.alibaba.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {

    Store findByProductId(Integer productId);

}

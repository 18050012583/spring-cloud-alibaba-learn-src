package com.example.alibaba.repository;

import com.example.alibaba.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Modifying
    @Query("update Order set status = 1 where userId = :userId and status = :status")
    void updateStatusByUserId(Integer status, Long userId);
}

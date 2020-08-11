package com.example.alibaba.entity;


import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "t_account")
public class Account {
    @Id
    private Long id;
    private Long userId;
    private BigDecimal total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}

package com.example.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_order")
@Data
public class Order {
    @Id
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}

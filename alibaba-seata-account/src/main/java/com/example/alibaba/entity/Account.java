package com.example.alibaba.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "t_account")
@Data
public class Account {
    @Id
    private Integer id;
    private Integer userId;
    private BigDecimal total;

}

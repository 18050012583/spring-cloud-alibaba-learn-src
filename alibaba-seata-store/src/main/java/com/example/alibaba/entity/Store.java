package com.example.alibaba.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "t_store")
@Data
public class Store {
    @Id
    private Integer id;
    private Integer productId;
    private Integer total;

}

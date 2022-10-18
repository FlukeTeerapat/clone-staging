package com.example.demo.Curency;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="currency")
public class Currency {

    @Id
    @GeneratedValue
    private String currency;

    private Integer decimals;
    private Integer enable;
    private Integer enable_deposit;
    private Integer enable_withdraw;
    private String created_at;
    private Integer created_by;
    private String updated_at;
    private Integer updated_by;
}

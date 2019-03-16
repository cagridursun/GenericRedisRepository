package com.ropsis.redis.redisexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product extends BaseEntity implements Serializable {


    private String name;

    private String description;

    private BigDecimal price;

    private Long stock;
}

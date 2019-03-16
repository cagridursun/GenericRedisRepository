package com.ropsis.redis.redisexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BaseEntity implements Serializable {

    private Long id;

    private Date createdDate;

    private Date updatedDate;
}

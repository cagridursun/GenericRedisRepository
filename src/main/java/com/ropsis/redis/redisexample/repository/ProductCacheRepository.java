package com.ropsis.redis.redisexample.repository;

import com.ropsis.redis.redisexample.model.Product;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCacheRepository extends AbstractCacheRepositoryImpl<Long, Product> {

    private final RedisTemplate<Long, Product> redisTemplate;

    private static final String PRODUCT_CACHE_KEY = "PRODUCT";

    public ProductCacheRepository(RedisTemplate<Long, Product> redisTemplate) {
        super(PRODUCT_CACHE_KEY, redisTemplate.opsForHash());
        this.redisTemplate = redisTemplate;
    }

}

package com.ropsis.redis.redisexample.repository;

import com.ropsis.redis.redisexample.model.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserCacheRepository extends AbstractCacheRepositoryImpl<Long, User> {


    private final RedisTemplate<Long, User> redisTemplate;

    private static final String USER_CACHE_KEY = "USER";

    public UserCacheRepository(RedisTemplate<Long, User> redisTemplate) {
        super(USER_CACHE_KEY, redisTemplate.opsForHash());
        this.redisTemplate = redisTemplate;
    }

}

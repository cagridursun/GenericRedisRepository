package com.ropsis.redis.redisexample.repository;

import java.util.Map;

public interface CacheRepository<K, V> {

    void save(V obj);
    Map<K, V> findAll();
    V findById(K id);
    void delete(K id);
}

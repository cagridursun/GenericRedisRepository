package com.ropsis.redis.redisexample.repository;

import com.ropsis.redis.redisexample.model.BaseEntity;
import org.springframework.data.redis.core.HashOperations;

import java.util.Map;

public abstract class AbstractCacheRepositoryImpl<K, V> implements CacheRepository<K, V> {

    private String CACHE_KEY;

    private HashOperations hashOperations;


    public AbstractCacheRepositoryImpl(final String CACHE_KEY, HashOperations hashOperations) {
        this.CACHE_KEY = CACHE_KEY;
        this.hashOperations = hashOperations;
    }

    public HashOperations getHashOperations() {
        return hashOperations;
    }

    @Override
    public void save(V obj) {
        hashOperations.put(CACHE_KEY, ((BaseEntity) obj).getId(), obj);
    }

    @Override
    public Map<K, V> findAll() {
        return hashOperations.entries(CACHE_KEY);
    }

    @Override
    public V findById(K id) {
        return (V) hashOperations.get(CACHE_KEY, id);
    }

    @Override
    public void delete(K id) {
        hashOperations.delete(id);
    }


}

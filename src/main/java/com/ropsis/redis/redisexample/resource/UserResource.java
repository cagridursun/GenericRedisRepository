package com.ropsis.redis.redisexample.resource;

import com.ropsis.redis.redisexample.model.User;
import com.ropsis.redis.redisexample.repository.CacheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserResource {

    private final CacheRepository<Long, User> userCacheRepository;

    @GetMapping
    public Map<Long, User> getAllUsers(){
        return userCacheRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") final Long id){
        return userCacheRepository.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody final User user){
        userCacheRepository.save(user);
        return userCacheRepository.findById(user.getId());
    }

    @PutMapping
    public User updateUser(@RequestBody final User user){
        userCacheRepository.save(user);
        return userCacheRepository.findById(user.getId());
    }

    @DeleteMapping("/{id}")
    public Map<Long, User> deleteUser(@PathVariable("id") final Long id){
        userCacheRepository.delete(id);
        return userCacheRepository.findAll();
    }
}

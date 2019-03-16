package com.ropsis.redis.redisexample.resource;

import com.ropsis.redis.redisexample.model.Product;
import com.ropsis.redis.redisexample.repository.CacheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductResource {


    private final CacheRepository<Long, Product> productCacheRepository;

    @GetMapping
    public Map<Long, Product> getAllProducts(){
        return productCacheRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") final Long id){
        return productCacheRepository.findById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody final Product product){
        productCacheRepository.save(product);
        return productCacheRepository.findById(product.getId());
    }

    @PutMapping
    public Product updateProduct(@RequestBody final Product product){
        productCacheRepository.save(product);
        return productCacheRepository.findById(product.getId());
    }

    @DeleteMapping("/{id}")
    public Map<Long, Product> deleteProduct(@PathVariable("id") final Long id){
        productCacheRepository.delete(id);
        return productCacheRepository.findAll();
    }
}

package com.ropsis.redis.redisexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Transient;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class RedisExampleApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(RedisExampleApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {


    }
    
}


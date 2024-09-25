package com.sb.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisJedisService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    // Save data in Redis using Jedis
    public void saveData(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    // Retrieve data from Redis using Jedis
    public String getData(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    // Delete data from Redis using Jedis
    public void deleteData(String key) {
        redisTemplate.delete(key);
    }
}

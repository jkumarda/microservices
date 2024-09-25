package com.sb.redis.restcontroller;

import com.sb.redis.service.RedisJedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RedisJedisController {
    @Autowired
    private RedisJedisService redisJedisService;

    @PostMapping("/save")
    public String saveData(@RequestParam String key, @RequestParam String value) {
        redisJedisService.saveData(key, value);
        return "Data saved in Redis!";
    }

    @GetMapping("/get")
    public String getData(@RequestParam String key) {
        return redisJedisService.getData(key);
    }

    @DeleteMapping("/delete")
    public String deleteData(@RequestParam String key) {
        redisJedisService.deleteData(key);
        return "Data deleted from Redis!";
    }
}

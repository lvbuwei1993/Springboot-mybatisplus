package com.serviceimle;

import com.util.RedisLock;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

public class SimpleRedisLock implements RedisLock {
    private RedisTemplate redisTemplate;
    /**
     *设置好锁的key
     */
    private String key;
    /**
     * 设置锁的value值,没有具体意义
     */
    private final String value = "1";

    public SimpleRedisLock(RedisTemplate redisTemplate, String key) {
        this.redisTemplate = redisTemplate;
        this.key = key;
    }

    @Override
    public boolean lock(long releaseTime) {
        Boolean ifAbsent = redisTemplate.opsForValue().setIfAbsent(key, value, releaseTime, TimeUnit.SECONDS);
        return ifAbsent != null && ifAbsent;
    }

    @Override
    public void unlock() {
       redisTemplate.delete(key);
    }
}

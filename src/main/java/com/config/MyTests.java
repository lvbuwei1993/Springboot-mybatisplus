/*
package com.config;

import com.serviceimle.SimpleRedisLock;
import com.util.RedisLock;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest// 指定启动类
public class MyTests {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test2() {
        // 创建锁对象
        RedisLock lock = new SimpleRedisLock(redisTemplate, "lock");
        // 获取锁,设置自动失效时间为50s
        boolean isLock = lock.lock(50);
        if (!isLock) {
            // 获取失败
            System.out.println("获取锁失败，停止定时任务");
            return;
        }
        try {
            System.out.println("获取锁成功，执行定时任务。");
            // 模拟任务耗时
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("任务执行异常");
        } finally {
            // 释放锁
//            lock.unlock();
        }
    }
}
*/

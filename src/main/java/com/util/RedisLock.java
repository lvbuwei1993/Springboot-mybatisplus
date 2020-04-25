package com.util;

public interface RedisLock {
    /**
     * 获取锁
     * @param releaseTime 设置过期时间
     * @return true获取成功 false获取失败
     */
   boolean lock(long releaseTime);

    /**
     * 释放锁
     */
   void unlock();
}

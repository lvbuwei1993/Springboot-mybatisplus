package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends Thread{
    public static void main(String[] args) {
//        BigDecimal a = new BigDecimal("123456789");
//        BigDecimal b = new BigDecimal("987321456");
//        System.out.println(b.add(b));
//        System.out.println(a.multiply(b));
//        System.out.println(a.subtract(b));
//        System.out.println(a.divide(b,2,BigDecimal.ROUND_HALF_UP));
        new Test().start();
        new BigDemo().start();
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(data.format(new Date()));
    }

    @Override
    public void run() {
        System.out.println("中华人民共和国中央人民政府今天正式成立了");

        try {
            Thread.sleep(10);
            System.out.println("当前线程停止了10秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程的名字"+Thread.currentThread().getName());
    }
}
class BigDemo extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("秦朝线程");
        System.out.println("线程2，公元前221年中国历史上第一个大一统王朝出现");
        try {
            Thread.sleep(10);
            System.out.println("当前线程的名字"+Thread.currentThread().getName());
            System.out.println("中国第二个大一统王朝汉朝建立");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
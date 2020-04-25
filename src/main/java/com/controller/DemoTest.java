package com.controller;

public class DemoTest {
    public static void main(String[] args) {
        String str = "**********8a*******b***********c***";
        String[] split = str.split("\\*");
        System.out.println(split.length);
        for (String ss :
                split) {
            System.out.println(ss);
        }
    }
}

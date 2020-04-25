package com.controller;

import java.io.*;

/**
 * Created by liumingyuan on 2019/8/4.
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
           fileInputStream = new FileInputStream("F:\\复习文件\\day02笔记.md");
           fileOutputStream = new FileOutputStream("F:\\复习文件\\day44笔记.md");
            int b;
            while ((b= fileInputStream.read()) !=-1){
                fileOutputStream.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}

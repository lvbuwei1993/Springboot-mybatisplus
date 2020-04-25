package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by liumingyuan on 2019/8/3.
 */
public class Demo1 {
    private String[] hanArr={"零","壹","贰","叁","肆","伍", "陆","柒","捌","玖"};
    private String[] unitArr={"拾","佰","仟","万","拾","佰","仟","亿","拾","佰","仟"};
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println( demo1.getstr("987654321"));

    }
    private String getstr(String  str){
        if(str == null && str.length() ==0){
            return "零";
        }
        String count = "";
        for (int i=0;i<str.length();i++){
            count=  count +   hanArr[str.charAt(i)-48];
            if(str.length()-i-2>=0){
                count=  count + unitArr[str.length()-i-2];
            }

        }
        return count;
    }
}
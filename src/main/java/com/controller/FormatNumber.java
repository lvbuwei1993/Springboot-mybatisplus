package com.controller;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by lvhong on 2019/4/12.
 */
public class FormatNumber {


    public static void main(String[] args) throws ParseException {
        DecimalFormat decimalFormat = new DecimalFormat(",###,###.00");
        System.out.println(decimalFormat.format(Long.valueOf("199307123"))); // out: 123,456,789.30
    }
    }



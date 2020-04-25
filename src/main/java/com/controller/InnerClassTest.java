package com.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class InnerClassTest {
  public static  double add(double a,double b){
      BigDecimal aa = new BigDecimal(a);
      BigDecimal bb = new BigDecimal(b);
      return aa.add(bb).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
  }
  public static double subtract(double a,double b ){
      BigDecimal aa = new BigDecimal(a);
      BigDecimal bb = new BigDecimal(b);
      return aa.subtract(bb).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
  }
  public static double multiply(double a,double b){
      BigDecimal aa = new BigDecimal(a);
      BigDecimal bb = new BigDecimal(b);
      return aa.multiply(bb).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
  }
  public static double  divide(double a,double b){
      BigDecimal aa = new BigDecimal(a);
      BigDecimal bb = new BigDecimal(b);
      return aa.divide(bb,2,BigDecimal.ROUND_DOWN).doubleValue();
  }
    public static void main(String[] args) {
//      double a = 123.1314d;
//      double b = 321.12345d;
//        System.out.println(add(a,b));
//        System.out.println(subtract(a,b));
//        System.out.println(multiply(a,b));
//        System.out.println(divide(a,b));
        try {
            String str = "aaa|bbb|ccc";
            String[] array = str.split("\\|",2);
            System.out.println(Arrays.toString(array));
            ArrayList linkedList = new ArrayList<>();
            linkedList.add("11");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}

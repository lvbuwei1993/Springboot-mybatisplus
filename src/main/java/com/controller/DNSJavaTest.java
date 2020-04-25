package com.controller;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.xbill.DNS.*;


/**
 * Created by lvhong on 2019/3/27.
 */
public class DNSJavaTest {
    public static void main(String[] args) throws Exception {


        String regStr = "^([A-Z]|[a-z]|[0-9]|[`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）――+|{}【】‘；：”“'。，、？]){6,20}$";
        if(!"123456789".matches(regStr)){
            System.out.println("不合法");
        }

       /* String domain = "www.hongtuweiye.club";
        System.out.println( InetAddress(domain));
      *//*  Adomain(domain);
        MXdomain(domain);*//*
        TXTdomain(domain);*/
       /* CNAMEdomain(domain);
*/
       /* System.out.println(  UUID.randomUUID().toString());*/
    }
    static String InetAddress(String domain) throws Exception {

        try{
            InetAddress addr = Address.getByName(domain);
            System.out.println("IP地址"+addr);
            return addr.toString();
        }catch(Exception e){
            e.printStackTrace();

        }
        return "123456";

    }
    static void Adomain(String domain) throws Exception {

        try{
            Record [] records =null;
            Lookup lookup = new Lookup(domain,Type.A);
            lookup.run();

            if(lookup.getResult() == Lookup.SUCCESSFUL){
                records=lookup.getAnswers();
            }else{
                System.out.println("A类型未查询到结果!");
                return;
            }
            for (int i = 0; i < records.length; i++) {
                ARecord mx = (ARecord) records[i];
                System.out.println("A类型"+mx.rdataToString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    static void MXdomain(String domain) throws Exception {

        try{
            Record [] records =null;
            Lookup lookup = new Lookup(domain,Type.MX);
            lookup.run();

            if(lookup.getResult() == Lookup.SUCCESSFUL){
                records=lookup.getAnswers();
            }else{
                System.out.println("MX类型未查询到结果!");
                return;
            }
            for (int i = 0; i < records.length; i++) {
                MXRecord mx = (MXRecord) records[i];
                System.out.println("MX类型"+mx.rdataToString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    static void TXTdomain(String domain) throws Exception {

        try{
            Record [] records =null;
            Lookup lookup = new Lookup(domain,Type.TXT);
            lookup.run();

            if(lookup.getResult() == Lookup.SUCCESSFUL){
                records=lookup.getAnswers();
            }else{
                System.out.println("TXT类型未查询到结果!");
                return;
            }
            for (int i = 0; i < records.length; i++) {
                TXTRecord mx = (TXTRecord) records[i];
                System.out.println("TXT类型"+mx.rdataToString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    static void CNAMEdomain(String domain) throws Exception {

        try{
            Record [] records =null;
            Lookup lookup = new Lookup(domain,Type.CNAME);
            lookup.run();

            if(lookup.getResult() == Lookup.SUCCESSFUL){
                records=lookup.getAnswers();
            }else{
                System.out.println("CNAME类型未查询到结果!");
                return;
            }
            for (int i = 0; i < records.length; i++) {
                CNAMERecord mx = (CNAMERecord) records[i];
                System.out.println("CNAME类型"+mx.rdataToString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}

package com.fan.think;

import com.fan.utils.ApacheBase64Util;
import com.fan.utils.JavaBase64Util;

import java.util.Calendar;

/**
 * @author fan
 * @create 2019-06-16 20:17
 * @description
 * @see
 */
public class Base64Test {
    public static StringBuffer sb = new StringBuffer("abcdeABCDE");
    public static final Base64Test test = new Base64Test();


    public static void main(String[] args) {
        test.num(1000*1000);
        test.num(1000*1000*10);
        test.num(1000*1000*20);
        test.num(1000*1000*40);
    }
    public void num(int num){
        for (int i = 0; i < num ; i++) {
            sb = sb.append(i);
        }
        test.javaBase64Test(num,sb.toString());
        test.apacheBase64(num,sb.toString());
    }

    public void javaBase64Test(int num,String string){
        long startTime = Calendar.getInstance().getTimeInMillis();
        String encode = JavaBase64Util.encode(string);
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Java Base64 encode 次数："+num+"花费时间："+ (endTime-startTime)+" ms");
        long startTime2 = Calendar.getInstance().getTimeInMillis();
        JavaBase64Util.decode(encode);
        long endTime2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Java Base64 decode 次数："+num+"花费时间："+ (endTime2-startTime2)+" ms");
    }

    public void apacheBase64(int num,String string){
        long startTime = Calendar.getInstance().getTimeInMillis();
        String encode = ApacheBase64Util.encode(string);
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("apache Base64 encode 次数："+num+" 花费时间："+(endTime-startTime)+" ms");

        long startTime2 = Calendar.getInstance().getTimeInMillis();
        ApacheBase64Util.encode(encode);
        long endTime2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("apache Base64 encode 次数："+num+"花费时间："+(endTime2-startTime2)+" ms");
    }
}

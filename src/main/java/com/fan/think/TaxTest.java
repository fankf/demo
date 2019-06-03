package com.fan.think;

import com.fan.utils.BigNumberCalaulateUtil;

import java.math.BigDecimal;

/**
 * @author fan
 * @create 2019-06-03 0:10
 * @description
 * @see
 */
public class TaxTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(0.027700/360+1);
        BigDecimal b2 = new BigDecimal(0.037890/12+1);
        BigDecimal b3 = new BigDecimal(1.047700);
        System.out.println(b1+"\r\n"+b2 +"\r\n" + b3);
        BigDecimal pow = BigNumberCalaulateUtil.pow(b1, 360,30);
        BigDecimal pow2 = BigNumberCalaulateUtil.pow(b2, 12,30);
        BigDecimal pow3 = BigNumberCalaulateUtil.pow(b3, 1,5);
        System.out.println(pow+"\r\n"+pow2+"\r\n"+pow3);
    }
}

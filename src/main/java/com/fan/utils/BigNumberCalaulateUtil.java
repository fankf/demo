package com.fan.utils;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author fan
 * @create 2019-06-02 23:39
 * @description
 * @see
 */
public class BigNumberCalaulateUtil {
    public static BigDecimal add(BigDecimal b1, BigDecimal b2) {
        return b1.add(b2);
    }

    public static BigDecimal substract(BigDecimal b1, BigDecimal b2) {
        return b1.subtract(b2);
    }

    public static BigDecimal multiply(BigDecimal b1, BigDecimal b2, int scale) {
        MathContext mc = new MathContext(scale);
        return b1.multiply(b2, mc);
    }

    public static BigDecimal divide(BigDecimal b1, BigDecimal b2, int scale) {
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * b1^b2  b1的b2次幂
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal pow(BigDecimal b1, int b2, int scale) {
        MathContext mc = new MathContext(scale);
        return b1.pow(b2, mc);
    }

    /**
     * 取余
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal remainder(BigDecimal b1, BigDecimal b2) {
        return b1.remainder(b2);
    }
}

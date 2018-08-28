package com.common.bigDecimal;

/**
 * @description: double和float不适合进行精确的运算,精确运算应使用BigDecimal
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class BigDecimalDemo {
    public static void main(String[] args) {
        double money = 1;
        double price = 0.1;
        System.out.println(money - price*9);
    }
}

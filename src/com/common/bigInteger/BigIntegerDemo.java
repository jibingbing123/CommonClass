package com.common.bigInteger;

import java.math.BigInteger;

/**
 * @description: 如果一个整数的取值超出了java整数类型的取值范围,就无法进行正常的数学运算
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class BigIntegerDemo {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        long b = a + 1;
        System.out.println("b = " + b);//输出为一个负数

        BigInteger bigA = new BigInteger(new Long(Long.MAX_VALUE).toString());
        BigInteger bigB = bigA.add(new BigInteger("1"));
        System.out.println("bigA = " + bigA);
        System.out.println("bigB = " + bigB);
    }
}

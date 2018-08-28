package com.common.bigDecimal;

import java.math.BigDecimal;

/**
 * @description: MathTool提供一系列用于浮点数精确运算的使用方法
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class MathTool {
    private static final int DEF_DIV_SCALE = 10;

    private MathTool(){}

    /**
    * @Description: 精确的加法运算
    * @Param: [v1, v2]
    * @Return: double
    * @Author: jibingbing
    * @Date: 2018/1/31
    */
    public static double add(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
    * @Description: 精确的减法运算
    * @Param: [v1, v2]
    * @Return: double
    * @Author: jibingbing
    * @Date: 2018/1/31
    */
    public static double subtract(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
    * @Description: 精确的乘法运算
    * @Param: [v1, v2]
    * @Return: double
    * @Author: jibingbing
    * @Date: 2018/1/31
    */
    public static double multiply(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    public static double divide(double v1,double v2,int scale){
        if(scale < 0){
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        double money = 1.0;
        double price = 0.1;
        double remain = subtract(money,multiply(price,1));
        System.out.println(remain);

        Object o;

        String s = new String("amit");
        System.out.println(s.substring(2));

        String s1 = s.replace("m","i");
        String s2 = s.concat("Poddar");//String类的concat()方法不会改变原字符串
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println((s + s1).charAt(5));

        StringBuffer sb = new StringBuffer("abcdefg");
        StringBuffer sb1 = sb.replace(0,1,"q");
        System.out.println(sb);
        System.out.println(sb == sb1);

        System.out.println(Math.floor(-2.1));//返回double类型
    }
}

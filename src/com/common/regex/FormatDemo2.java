package com.common.regex;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/01/30
 **/
public class FormatDemo2 {
    public static void main(String[] args) {
        System.out.println(String.format("Hi,%s","小红"));
        System.out.println(String.format("%s:%s.%s","名单","张三","李四","王五"));
        System.out.println(String.format("字母a的大写是: %C %n",'a'));
        System.out.println(String.format("3<7的结果是: %B %n",3<7));
        System.out.println(String.format("100的一半是: %d %n",100/2));
        System.out.println(String.format("10的16进制数是: %x %n",10));
        System.out.println(String.format("10的8进制数是: %o %n",10));
        System.out.println(String.format("80元打85折后为: %f %n",80*0.85));
        System.out.println(String.format("上面价格的指数表示是: %e %n",80*0.85));
        System.out.println(String.format("上面的折扣是: %d%% %n",85));
        System.out.println(String.format("字母A的散列码是: %h %n",'A'));
    }
}

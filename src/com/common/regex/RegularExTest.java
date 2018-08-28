package com.common.regex;

/**
 * @description: 正则表达式
 * 具有特殊含义的符号如:".","?","*",如果要表示类似上面的字符,必须以\\开头
 * @author: jibingbing
 * @create: 2018/01/30
 **/
public class RegularExTest {
    public static void main(String[] args) {
        //正则{n}:表示恰好n次,a{3}表示aaa
        System.out.println("aaabaaacaaa".replaceAll("a{3}","z"));

        //正则{n,m}:表示至少n次,不多于m次,a{1,3}表示a,aa或者aaa
        System.out.println("aaabaaacaaa".replaceAll("a{1,3}","\\*"));

        // \d:任意一个数字,等价于[0-9]
        System.out.println("123a44b35cc".replaceAll("\\d","z"));
        System.out.println("123a44b35cc".replaceAll("[0-9]","z"));

        // \D:任意一个非数字,等价于[^0-9]
        System.out.println("123a44b35cc".replaceAll("\\D","z"));
        System.out.println("123a44b35cc".replaceAll("[^0-9]","z"));

        //把字符串中的.替换成\
        System.out.println("com.abc.dollapp.Doll".replaceAll("\\.","\\\\"));

        //正则.:表示任意一个字符,a.b表示以a开头,以b结尾长度为3的任意字符串
        System.out.println("azbhelloahball".replaceAll("a.b","-"));

        //正则\w:表示任意词字符,等价于[a-zA-Z_0-9]
        System.out.println("a.v.1.24".replaceAll("\\w","#"));
        System.out.println("a.v.1.24".replaceAll("[a-zA-z_0-9]","#"));
    }
}

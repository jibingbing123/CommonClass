package com.common.regex;

import java.util.Date;
import java.util.Locale;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/01/30
 **/
public class FormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%tc",date));
        System.out.println(String.format(Locale.CHINESE,"%tc",date));
        System.out.println(String.format(Locale.ENGLISH,"%tc",date));
        System.out.println(String.format(Locale.CHINA,"%tc",date));
    }
}

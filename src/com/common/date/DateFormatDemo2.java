package com.common.date;

import java.text.DateFormat;
import java.util.Date;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/01/30
 **/
public class DateFormatDemo2 {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        DateFormat dateFormat1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        DateFormat dateFormat3 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);

        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat1.format(date));
        System.out.println(dateFormat2.format(date));
        System.out.println(dateFormat3.format(date));
    }
}

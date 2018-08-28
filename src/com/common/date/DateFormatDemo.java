package com.common.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/01/30
 **/
public class DateFormatDemo {
    public static Date parseDate(String text,String format){
        try {
            return new SimpleDateFormat(format).parse(text);
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-EEEE");
        System.out.println(dateFormat.format(date));

        dateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(date));

        Date date1 = parseDate("04-23-2018","MM-dd-yyyy");
        System.out.println(date1);

        date1 = parseDate("2018/01/30 22:47:23","yyyy/MM/dd hh:mm:ss");
        System.out.println(date1);
    }
}

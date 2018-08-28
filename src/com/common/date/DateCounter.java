package com.common.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 计算两个日期之间相隔多少天
 * @author: jibingbing
 * @create: 2018/01/30
 **/
public class DateCounter {
    public static void main(String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date1 = dateFormat.parse("30-01-2018");
        Date date2 = dateFormat.parse("10-02-2018");

        long d = getCount(date2,date1);
        System.out.println(d);
    }

    public static long getCount(Date d1,Date d2){
        long p = d1.getTime() - d2.getTime();
        return p/(1000 * 60 * 60 * 24);
    }
}

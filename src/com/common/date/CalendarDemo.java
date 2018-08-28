package com.common.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @description: Calendar类是抽象类,不能实例化,它有一个具体的子类GregorianCalendar,具体用法如下
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class CalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(cal.getTime()));

        cal.clear();
        cal.set(Calendar.YEAR,2018);
        cal.set(Calendar.MONTH,Calendar.JULY);
        cal.set(Calendar.DAY_OF_MONTH,15);
        cal.set(Calendar.HOUR_OF_DAY,12);
        cal.set(Calendar.MINUTE,33);
        cal.set(Calendar.SECOND,55);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(cal.getTime()));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EEEE");
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        System.out.println("当前时间: " + dateFormat.format(calendar.getTime()));


        calendar.set(GregorianCalendar.DAY_OF_WEEK,GregorianCalendar.FRIDAY);
        System.out.println("改为星期五后的时间: " + dateFormat.format(calendar.getTime()));

        int fridayCounter = 0;
        while(fridayCounter < 4){
            calendar.add(GregorianCalendar.DAY_OF_MONTH,7);

            if(calendar.get(GregorianCalendar.DAY_OF_MONTH) == 13){
                fridayCounter++;
                System.out.println(dateFormat.format(calendar.getTime()));
            }
        }
    }
}

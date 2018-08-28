package com.common.date;

import java.time.*;

/**
 * @description: 表示日期时间的LocalDateTime类
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("当前日期时间: " + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("当前日期时间: " + today);

        LocalDateTime specificDateTime = LocalDateTime.of(2018, Month.FEBRUARY,1,10,20,30);
        System.out.println("特定的日期时间: " + specificDateTime);

        LocalDateTime todayParis = LocalDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("巴黎的当前日期时间: " + todayParis);

        LocalDateTime dateTimeFromBase = LocalDateTime.ofEpochSecond(10000,0,ZoneOffset.UTC);
        System.out.println("经过特定秒数后的日期时间: " + dateTimeFromBase);
    }
}

package com.common.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * @description: JDK8开始表示日期的LocalDate类
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class LocalDateDemo {
    public static void main(String[] args) {
        //当前日期
        LocalDate today = LocalDate.now();
        System.out.println("当前日期:" + today);

        //根据特定参数创建日期
        LocalDate firstDay_2018 = LocalDate.of(2018, Month.JANUARY,1);
        System.out.println("根据参数生成的日期: " + firstDay_2018);

        //获取特定地点的当前日期
        LocalDate todayParis = LocalDate.now(ZoneId.of("Europe/Paris"));
        System.out.println("巴黎当前的日期: " + todayParis);

        //根据基准日开始算起的日期
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("从1970/1/1起相隔365天的日期: " + dateFromBase);

        //从特定年份开始算起的日期
        LocalDate hundredDay2016 = LocalDate.ofYearDay(2016,100);
        System.out.println("2016的第一百天: " + hundredDay2016);
    }
}

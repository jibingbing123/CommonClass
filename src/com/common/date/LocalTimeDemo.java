package com.common.date;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @description: 表示时间的LocalTime类
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("当前时间: " + time);

        LocalTime specificTime = LocalTime.of(12,23,45,33);
        System.out.println("特定的时间: " + specificTime);

        LocalTime timeParis = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("巴黎当前时间: " + timeParis);

        LocalTime specificSencondTime = LocalTime.ofSecondOfDay(60*60*3 + 60*15 + 44);
        System.out.println("经过特定秒数后的时间: " + specificSencondTime);
    }
}

package com.lesson.review2;

import java.time.LocalDateTime;

public class Test07 {
    /*public static LocalDateTime now()
    * public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒)*/
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ldt1 = LocalDateTime.of(2000, 8, 8, 12, 2,3);
        System.out.println(ldt1.getYear());
        System.out.println(ldt1.getMonth());
        System.out.println(ldt1.getDayOfMonth());
        System.out.println(ldt1.getDayOfWeek());
        System.out.println(ldt1.getDayOfYear());
        System.out.println(ldt1.getHour());
        System.out.println(ldt1.getMinute());
        System.out.println(ldt1.getSecond());


        System.out.println(ldt1.toLocalDate());
        System.out.println(ldt1.toLocalTime());


        System.out.println(ldt1);
    }

}

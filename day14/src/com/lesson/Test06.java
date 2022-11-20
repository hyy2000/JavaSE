package com.lesson;

import java.time.LocalDateTime;

public class Test06 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 11, 11, 11, 11);
        System.out.println(localDateTime);
    }
}

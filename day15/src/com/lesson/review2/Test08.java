package com.lesson.review2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test08 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("yyyy--MM--dd HH:mm:ss");
        String s = now.format(dtfm);
        String s1 = dtfm.format(now);
        System.out.println(s+"..."+s1);


        LocalDate l1 = LocalDate.of(2000,8,8);
        LocalDate l2 = LocalDate.of(2000,9,8);
        Period p = Period.between(l1,l2);
        System.out.println(p);


    }
}

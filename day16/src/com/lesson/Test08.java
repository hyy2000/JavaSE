package com.lesson;

import java.util.TreeSet;

public class Test08 {
    public static void main(String[] args) {
        TreeSet<Student> tss = new TreeSet<>();
        tss.add(new Student("可莉1",8));
        tss.add(new Student("可莉1",8));
        tss.add(new Student("可莉1",9));
        tss.add(new Student("可莉2",8));
        tss.add(new Student("可莉3",9));
        tss.add(new Student("可莉4",8));
        System.out.println(tss.size());
        System.out.println(tss);
    }
}

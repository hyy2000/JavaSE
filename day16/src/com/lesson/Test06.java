package com.lesson;

import java.util.TreeSet;

public class Test06 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(888);
        ts.add(777);
        ts.add(666);
        ts.add(555);
        ts.add(444);
        ts.add(888);
        ts.add(888);
        ts.add(333);
        ts.add(222);
        System.out.println(ts.size());

        System.out.println(ts);


    }
}

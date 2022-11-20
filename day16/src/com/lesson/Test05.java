package com.lesson;

import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

       /* hs.add("aaa");
        hs.add("aaa");
        hs.add("nnn");
        hs.add("aaa");
        hs.add("accc");
        hs.add("aadddddda");
        System.out.println(hs.size());
        System.out.println(hs);*/
        hs.add(new Student("可莉",8));
        hs.add(new Student("可莉1",8));
        hs.add(new Student("可莉2",8));
        hs.add(new Student("可莉3",8));
        hs.add(new Student("可莉",8));
        hs.add(new Student("可莉",8));
        hs.add(new Student("可莉4",8));
        System.out.println(hs);
        System.out.println(hs.size());


        HashSet<Student> h1 = new HashSet<>();
        h1.add(new Student("可莉000",8));
        h1.add(new Student("可莉001",8));
        h1.add(new Student("可莉002",8));

        h1.addAll(hs);
        System.out.println(h1);


    }
}

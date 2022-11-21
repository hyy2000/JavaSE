package com.preview;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("程蝶衣1",17);
        Student s2 = new Student("程蝶衣2",18);
        Student s3 = new Student("程蝶衣3",19);
        Student s4 = new Student("程蝶衣4",15);
        Student s5 = new Student("程蝶衣5",16);
        Student s6 = new Student("程蝶衣5",16);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
       System.out.println(ts);

    }
}

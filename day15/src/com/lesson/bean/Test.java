package com.lesson.bean;

public class Test {
    public static void main(String[] args) {
        Student[] sarr = new Student[3];
        Student s = new Student("zhang",19);
        sarr[0] = s;

        System.out.println(sarr[0].getAge());
        sarr[0].setAge(20);
        System.out.println(sarr[0].getAge());
    }

}


package com.lesson.bean;

public class TestInteger {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);//true

        Integer i = 128;
        Integer j = 128;
        System.out.println(i == j);//false

        Integer m = new Integer(1);//新new的在堆中
        Integer n = 1;//这个用的是缓冲的常量对象，在方法区
        System.out.println(m == n);//false

        Integer x = new Integer(1);//新new的在堆中
        Integer y = new Integer(1);//另一个新new的在堆中
        System.out.println(x == y);//false
    }
}



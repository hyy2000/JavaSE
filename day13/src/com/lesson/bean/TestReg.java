package com.lesson.bean;

public class TestReg {

    public static void main(String[] args) {

        String s1 = "张三,李四,王五,小明,小王";
        String [] arr = s1.split(",");

        for (String s : arr) {
            System.out.println(s);

        }
    }
}

package com.atguigu.test;

public class DemoTest19 {
    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i);
    }
    public static int change(int i){
        i++;
        return i;
    }

}

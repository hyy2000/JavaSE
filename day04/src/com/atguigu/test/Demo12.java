package com.atguigu.test;
/*
 请定义方法,对应完成如下功能:
        1.求出两个整数的和
        2.求出三个整数的和
        3.求出两个小数的和
 */
public class Demo12 {
    public static void main(String[] args) {

        System.out.println(sum(4, 8));
        System.out.println(sum(2, 4, 6));
        System.out.println(sum(4.2, 5.1));

    }

    public static int sum(int a,int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        return a+b+c;

    }

    public static double sum(double a,double b){
        return a+b;
    }

}

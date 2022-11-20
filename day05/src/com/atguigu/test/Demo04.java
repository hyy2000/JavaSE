package com.atguigu.test;
//有两个变量a,b
//希望经过一系列的操作,获得的结果为ab值进行互换
//如: a= 10; b= 20;  结果 a= 20; b= 10
public class Demo04 {
    public static void main(String[] args) {
        swap(8 ,9);
    }


    public static void swap(int a,int b){
        int temp= 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a ：" + a);
        System.out.println("b ：" + b);

    }
}

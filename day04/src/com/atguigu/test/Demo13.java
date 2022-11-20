package com.atguigu.test;
//计算5的阶乘
public class Demo13 {
    public static void main(String[] args) {
        System.out.println(fun(20));
    }


    public static long fun(long n) {

        if (n==1) {
            return 1;
        } else{
            return n * fun(n - 1);
        }

    }

}


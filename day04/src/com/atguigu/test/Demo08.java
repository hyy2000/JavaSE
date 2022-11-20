/*
需求1:定义一个方法,求出两个整数的最大值
 */
package com.atguigu.test;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        System.out.print("调用max方法：");
        System.out.println(max(14,8));

        System.out.print("调用max1方法：");
        max1(15,8);

        //获取键盘输入数字，然后比较大小
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int n = sc.nextInt();
        System.out.println("请输入数字");
        int m = sc.nextInt();
        max1(n,m);
        sc.close();
    }

    public static int max(int a,int b){
        //max方法，返回最大的数字
       // int max = a>b?a:b;
        return a>b?a:b;
    }

    public static void max1(int m,int n){
        //max1方法，直接打印输出最大数
        System.out.println("最大数： " + (m>n?m:n));
    }
}

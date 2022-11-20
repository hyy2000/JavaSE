package com.atguigu.test;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(sum(n,m));
        sc.close();

    }

    public static int sum(int a,int b){
        //int sum = a+b;
        return a+b;
    }
}

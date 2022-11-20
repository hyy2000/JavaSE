package com.lesson;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        //Scanner使用空格，回车等作为分隔符

        //第一个案例
        /*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i+"..."+j);*/

        //第二个案列
       /* Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1+"..."+s2);*/

        //第三个案例
       /* Scanner sc = new Scanner(System.in);

        System.out.println("请输入int");
        int i = sc.nextInt();
        System.out.println("请输入String");
        String s3 = sc.nextLine();
        System.out.println(i+"      "+s3);*/

        Scanner sc = new Scanner(System.in);


        System.out.println("请输入String");
        String s3 = sc.nextLine();
        System.out.println("请输入int");
        int i = sc.nextInt();
        System.out.println(i+"      "+s3);



    }
}

package com.lesson.bean;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //1.需求：模拟登录,给三次机会,并提示还有几次。
        //	用户名和密码都是admin
        int flag = 0;
        String username = "admin";
        String password = "admin";
        Scanner sc = new Scanner(System.in);
       while (flag<3){

           System.out.println("input usename: ");
           String s = sc.next();

           System.out.println("input password: ");


       }

    }
}

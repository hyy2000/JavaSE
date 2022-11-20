package com.lesson.examp;

import java.util.Scanner;

public class Example1 {
//    需求:模拟用户登录,共三次机会,并提示还有几次。(正确用户名和密码都是admin)
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);

        while (flag<3){
            System.out.println(" input username: ");
            String username = sc.nextLine();
            System.out.println(" input password");
            String pwd = sc.nextLine();
//            if (username.equals("admin")&&pwd.equals("admin")){
            if ("admin".equals(username)&&"admin".equals(pwd)){
                //如果是字符串常量和字符串变量比较,通常都是字符串常量调用方法,将变量当作参数,防止空指针异常
                System.out.println("登录成功");
                break;
            }else if (flag ==2){
                System.out.println("登录次数已用完，请明天再试");

            }else System.out.println("登录失败，还剩下"+(2-flag)+"次机会");
            flag++;

        }

    }
}

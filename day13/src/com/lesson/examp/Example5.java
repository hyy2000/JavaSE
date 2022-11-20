package com.lesson.examp;

import java.util.Scanner;

public class Example5 {
    /*需求：把字符串反转
	举例：键盘录入"abc"
	输出结果："cba"*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：  ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        String s1 = String.valueOf(sb);
        System.out.println(s1);
    }
}

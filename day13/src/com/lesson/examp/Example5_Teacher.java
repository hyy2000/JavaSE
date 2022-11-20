package com.lesson.examp;

import java.util.Scanner;

public class Example5_Teacher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            char aChar = chars[i];
            System.out.print(aChar);
        }

    }
}

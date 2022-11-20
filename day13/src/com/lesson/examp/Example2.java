package com.lesson.examp;

import java.util.Arrays;

public class Example2 {
    /*需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
ABCDEabcd123456!@#$%^*/
    public static void main(String[] args) {
        String s = "ABCDEabcd123456!@#$%^";
        int big= 0;
        int small = 0;
        int ch = 0;
        int n = 0;


        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]>='0'&&c[i]<='9'){
                //注意是 '0' 而不是0
                //注意边界值，应该用>=,<=
                 n++;
            }else if (c[i]>='a'&&c[i]<='z'){
                //注意边界值，应该用>=,<=
                small++;
            }else if (c[i]>='A'&&c[i]<='Z'){
                //注意边界值，应该用>=,<=
                big++;
            }else {ch++;}

        }
        System.out.println("大写字母： "+big);
        System.out.println("小写字母： "+small);
        System.out.println("数字： "+n);
        System.out.println("字符： "+ch);

    }
}

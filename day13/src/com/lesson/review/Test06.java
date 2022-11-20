package com.lesson.review;

import java.util.Arrays;
import java.util.Locale;

public class Test06 {
    /*  byte[] getBytes():把字符串转换为字节数组。
        char[] toCharArray():把字符串转换为字符数组。
        static String valueOf(char[] chs):把字符数组转成字符串。
        static String valueOf(int i):把int类型的数据转成字符串。
         注意：String类的valueOf方法可以把任意类型的数据转成字符串。
        String toLowerCase():把字符串转成小写。(了解)
        String toUpperCase():把字符串转成大写。
        String concat(String str):把字符串拼接。(concat方法拼接，哪怕是两个常量对象拼接，结果也是在堆)   */
    public static void main(String[] args) {
        String s1 = "abcdefg";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));
        String s2 = new String();
        System.out.println(s2.valueOf(chars));
        System.out.println(s2.valueOf(34354));
        String a = "abcdefsdfsjfljlfjsl";
        System.out.println(a.toUpperCase());

        System.out.println("AJFKAJ KAJKL J".toLowerCase());

        System.out.println(a.concat(a.toUpperCase()));

    }
}

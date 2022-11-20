package com.lesson.bean;

/*      boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
        boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        boolean contains(String str):判断字符串中是否包含参数字符串
        boolean startsWith(String str):判断字符串是否以指定的参数字符串开头
        boolean endsWith(String str):判断字符串是否以某个指定的参数字符串结尾
        boolean isEmpty():判断字符串是否为空。 与null区分*/
public class TesstString02 {
    public static void main(String[] args) {

        String s1 = "abCED";
        String s2 = "ABCED";
        System.out.println(s1.equals(s2));//flase
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("----------------");
        String s3 = "adgjk";
        String s4 = "gj";
        System.out.println(s3.contains(s4));//true

        System.out.println("---------");
        String s5 = "sfsdjgodi";
        String s6 = "sf";
        System.out.println(s5.startsWith(s6));//true
        String s7 = "di";
        System.out.println(s5.endsWith(s7));//true

        System.out.println("==============");
        String s8 = "";
        String s9 = new String();
        String s10 = new String("");
        System.out.println(s8.isEmpty());//true
        System.out.println(s9.isEmpty());//true
        System.out.println(s10.isEmpty());//true
        System.out.println(s8.length());//0
        System.out.println(s9.length());//0
        System.out.println(s10.length());//0

        System.out.println("-------------");
        String s11 = null;
       // System.out.println(s11.isEmpty());//NullPointerException

    }

}

package com.lesson.review;

public class Test04 {
/*   字符串的常用方法
    判断
    boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
    boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
    boolean contains(String str):判断字符串中是否包含参数字符串
    boolean startsWith(String str):判断字符串是否以指定的参数字符串开头
    boolean endsWith(String str):判断字符串是否以某个指定的参数字符串结尾
    boolean isEmpty():判断字符串是否为空。 与null区分*/
public static void main(String[] args) {
    String s1 = "abCED";
    String s2 = "ABCED";
    System.out.println(s1.equals(s2));//比较字符串的内容是否相同,区分大小写
    System.out.println(s1.equalsIgnoreCase(s2));//比较字符串的内容是否相同,忽略大小写

    System.out.println("----------------");
    String s3 = "adgjk";
    String s4 = "gj";
    System.out.println(s3.contains(s4));

    System.out.println("---------");
    String s5 = "sfsdjgodi";
    String s6 = "sf";
    System.out.println(s5.startsWith(s6));
    String s7 = "di";
    System.out.println(s5.endsWith(s7));
    System.out.println("---------");
    String s8 = "";
    String s9 = new String();
    String s10 = new String("");
    System.out.println(s8.isEmpty());
    System.out.println(s9.isEmpty());
    System.out.println(s10.isEmpty());
    System.out.println(s8.length());
    System.out.println(s9.length());
    System.out.println(s10.length());

    System.out.println("-------------");
    String s11 = null;
   // System.out.println(s11.isEmpty());//NullPointerException





}
}

package com.lesson.review;

public class Test05 {
    /*  int length():获取字符串的长度。
        char charAt(int index):获取指定索引位置的字符
        int indexOf(int ch):返回指定字符在此字符中第一次出现处的索引。
        int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
        int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
        int indexOf(String str,int fromIndex):返回指定 字符串 在此字符串中从指定位置后第一次出现处的索引。
        lastIndexOf
        String substring(int start):从指定位置开始截取字符串(含),默认到末尾。
        String substring(int start,int end):从指定位置开始(含)到指定位置结束截取字符串*/
    public static void main(String[] args) {
        String s1 = "sarah";
        System.out.println(s1.length());

        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.indexOf('r', 1));
        System.out.println(s1.indexOf("r", 1));
        s1.lastIndexOf('r');
        s1.lastIndexOf("r");

        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1, 4));


        char[] ch = new char[]{'1','j','k','l','i','y'};


    }
}

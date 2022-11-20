package com.lesson.review;

public class Test01 {
    /*public String():空构造
    public String(byte[] bytes):把字节数组转成字符串
    public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
    public String(char[] value):把字符数组转成字符串   //字符常量 字符串
    public String(char[] value,int index,int count):把字符数组的一部分转成字符串
    public String(String original):把字符串常量值转成字符串

*/
    public static void main(String[] args) {
        String s = new String();
        byte[] arr = {1,3,56,89,3,7,9};
        String s1 = new String(arr);
        String s2 = new String(arr,1,3);
        char[] ch = {'3','j','k','l','g','u','o'};
        String s3 = new String(ch);
        String s4 = new String(ch, 1, 4);
        new String("996.icu");

        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


    }
}

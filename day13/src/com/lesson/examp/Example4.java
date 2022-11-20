package com.lesson.examp;

public class Example4 {
    /*需求：把一个字符串的首字母转成大写，其余为小写。(需求只考虑英文大小写字母字符)
	例:woaisaraHHahaaaa*/

    public static void main(String[] args) {
        String s ="woaisaraHHahaaaa";
       char ch = s.charAt(0);//获取字符串首字母
        String subs = s.substring(1, s.length() - 1);//截取字符串
        String s1 = subs.toLowerCase();//将截取的字符串转小写
        String s2 = String.valueOf(ch);//将首字母转为字符串
        String s3 = s2.toUpperCase();//将转为字符串的首字母转大写

        System.out.println(s3+s1);
    }
}

package com.lesson.review;

public class Test07 {
    /*  String的替换功能及案例演示
        String replace(char old,char new) 将该字符串的old字符用new字符替换
        String replace(String old,String new)
        String的去除字符串两空格及案例演示
        String trim()      //去除字符串前后的空字符
        String的按字典顺序比较两个字符串及案例演示
        int compareTo(String str)// 先获取两个字符串的长度,如果字符相同则返回长度的差值,否则返回的是字符码表值的差值
        int compareToIgnoreCase(String str)(比较忽略大小写)
        String字符串在常量池中共享
        public String intern()：结果在常量池中共享*/
    public static void main(String[] args) {
        String s = "hyytestjxjy";
        System.out.println(s.replace("test", "hyy"));
        System.out.println(s.replace('t', 'h'));

        String s1 = "       hyy   testjxjy     ";
        System.out.println(s1);
        System.out.println(s1.trim());

        s1.intern();
    }
}

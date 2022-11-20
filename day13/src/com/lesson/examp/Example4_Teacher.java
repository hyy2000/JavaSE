package com.lesson.examp;

public class Example4_Teacher {
    public static void main(String[] args) {
        /*需求：把一个字符串的首字母转成大写，其余为小写。(需求只考虑英文大小写字母字符)
	例:woaisaraHHahaaaa*/

        String s ="woaisaraHHahaaaa";
        String s1 = s.substring(0, 1)
                .toUpperCase();
        String s2 = s.substring(1, s.length())
                .toLowerCase();
        System.out.println(s1.concat(s2));
        //System.out.println(s1+s2);

        //concat方法拼接，及时两个对象都是常量，结果也在堆中
        //常量+常量存储在常量池(常量优化,因为编译期间就可以确定结果)
        //常量+变量，变量+变量结果在堆中
        //拼接后调用intern方法，结果在常量池


    }

}

package com.lesson.review;

public class Test03 {
//    "+"拼接结果的存储和比较问题
  /*  （1）常量+常量：结果是常量池(常量优化,因为编译期间就可以确定结果)
      （2）常量与变量 或 变量与变量：结果是堆
      （3）拼接后调用intern方法：结果在常量池*/

    public static void main(String[] args) {
        final String s1 = "hello";
        final String s2 = "world";
        String s3 = "hello";
        String s4 = "world";

        String s5 = "helloworld";

        String s6 = s1 + s2;//常量+ 常量 结果在常量池中，因为编译期间就可以确定结果
        String s7 = s3 + "world";//s3是变量，"world"常量，变量 + 常量的结果在堆中
        String s8 = s3 + s4;//s3和s3都是变量，变量 + 变量的结果在堆中
        String s9 = "hello" + "world";//常量+ 常量 结果在常量池中，因为编译期间就可以确定结果

        System.out.println(s5 == s6);//true
        System.out.println(s5 == s7);//false
        System.out.println(s5 == s8);//false
        System.out.println(s5 == s9);//true
        System.out.println("=====================");

        String s11 = "hello";
        String s22 = "world";
        String s33 = "helloworld";

        String s44 = (s11 + "world").intern();//把拼接的结果放到常量池中
        String s55 = (s11 + s22).intern();

        System.out.println(s33 == s44);//true
        System.out.println(s33 == s55);//true


    }
}

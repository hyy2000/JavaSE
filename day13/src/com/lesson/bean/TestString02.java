package com.lesson.bean;

public class TestString02 {
  /* public StringBuilder()     创建一个空白可变字符串对象，不含有任何内容
     public StringBuilder(String   str) 根据字符串的内容，来创建可变字符串对象   */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(789)
                .append("jkl")
                .append('u')
                .append(3.5));


    }

}

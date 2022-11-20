package com.lesson.review;

public class Test02 {
  /* 通过构造方法创建
        通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然内容相同，但是地址值不同
    直接赋值方式创建
        以“ ”方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，
        JVM 都只会建立一个 String 对象，并在字符串池中维护*/
  public static void main(String[] args) {
      String str1 = "hello";
      String str2 = new String("hello");
      System.out.println(str1 == str2);
  }

}

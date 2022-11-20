package com.lesson;

public class Test05 {
    public static void main(String[] args) {
        //系统类中很多好用的方法，其中常用几个如下：
        //- static long currentTimeMillis() ：返回当前系统时间距离1970-1-1 0:0:0的毫秒值
        //- static void exit(int status) ：退出当前系统
        //- static void gc() ：运行垃圾回收器。

        System.out.println(System.currentTimeMillis());
       // System.exit();
        System.gc();

        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");

    }
}

package com.lesson.review2;

import java.util.Date;

public class Test04 {
    /*构造方法
	- public Date()  如果没有传参数代表的是当前系统时间
	- public Date(long date) 把该毫秒值换算成日期时间对象,如果构造方法中参数传为0代表的是1970年1月1日   元年

成员方法
	- public long getTime() 当前系统时间距离1970-1-1 0:0:0 0毫秒的时间差，毫秒为单位
      与System.currentTimeMillis()功能相似
	- public void setTime(long time)  设置毫秒值,改变时间对象*/

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());
//        date.setTime(1668654513311l);
//        System.out.println(date);


        System.out.println(System.currentTimeMillis());
    }
}

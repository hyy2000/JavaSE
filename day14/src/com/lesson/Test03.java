package com.lesson;

import java.util.Date;

public class Test03 {
    /*构造方法
	- public Date()  如果没有传参数代表的是当前系统时间
	- public Date(long date) 把该毫秒值换算成日期时间对象,如果构造方法中参数传为0代表的是1970年1月1日   元年
	成员方法
	- public long getTime() 当前系统时间距离1970-1-1 0:0:0 0毫秒的时间差，毫秒为单位
      与System.currentTimeMillis()功能相似
	- public void setTime(long time)  设置毫秒值,改变时间对象
	*/
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//Tue Nov 15 10:39:13 CST 2022

        Date date1 = new Date(0);//Thu Jan 01 08:00:00 CST 1970
        System.out.println(date1);

        Date date2 = new Date(1000);
        System.out.println(date2);//Thu Jan 01 08:00:01 CST 1970

        System.out.println(new Date().getTime());//1668479953385

        date1.setTime(1000);
        System.out.println(date1);//Thu Jan 01 08:00:01 CST 1970



    }
}

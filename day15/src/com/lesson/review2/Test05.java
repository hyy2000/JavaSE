package com.lesson.review2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test05 {
//    构造方法
//    public SimpleDateFormat()//默认的时间转换格式
//-   public SimpleDateFormat(String pattern)//自定义格式  取决于  参数格式
//成员方法
//    public final String format(Date date)     Date --> String
//-   public Date parse(String source)			String --> Date   // 字符串需是日期格式

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf1.format(date));

        String s = "2022-11-17 11-50-35";
        System.out.println(sdf1.parse(s));


    }
}

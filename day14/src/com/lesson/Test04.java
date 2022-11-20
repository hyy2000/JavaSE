package com.lesson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
    /*  - public SimpleDateFormat()//默认的时间转换格式
        - public SimpleDateFormat(String pattern)//自定义格式  取决于  参数格式

        - public final String format(Date date)     Date --> String
        - public Date parse(String source)			String --> Date   // 字符串需是日期格式*/
    public static void main(String[] args) throws Exception{
        Date date = new Date();

        SimpleDateFormat spf = new SimpleDateFormat();
        System.out.println(spf.format(date));

        SimpleDateFormat spf1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(spf1.format(new Date()));

        String str = "2022/10/24/ 10:24:00";
        SimpleDateFormat spf2 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(spf2.parse(str));
    }
}

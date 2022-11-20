package com.lesson.bean;

public class TestGetA {

    public static void main(String[] args) {
      /*  int a = 6;
        int a1 = getA(a);
        //System.out.println(getA(a));
        System.out.println("a1 = " + a1);*/

        Integer ig = new Integer(1000);
        Integer igStr = new Integer("1999");
        Integer igValueOf = Integer.valueOf(1000);
        Integer igValueOf1 = Integer.valueOf("999");
        Integer integer = Integer.valueOf(2008);
        int i = igStr.intValue();

        Integer.bitCount(10);
        ig.byteValue();

        Integer integer2 = 9;//自动装箱

        int i1 = integer2 - 9;//自动拆箱

        //基本数据类型转字符串
        String s = String.valueOf(200);
        String s1 = "" + 9999;


    }


    public static int getA(int a){
        return 110;
    }
}

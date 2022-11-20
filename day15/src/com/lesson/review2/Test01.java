package com.lesson.review2;

import java.math.BigInteger;

public class Test01 {
    /*不可变的任意精度的整数。可以让超过Integer范围内的数据进行运算

构造方法
	- public BigInteger(String val)
成员方法
	- BigInteger add(BigInteger val)            加
	- BigInteger subtract(BigInteger val)       减
	- BigInteger multiply(BigInteger val)       乘
	- BigInteger divide(BigInteger val)         除
	- BigInteger remainder(BigInteger val)      余*/
    public static void main(String[] args) {
        BigInteger b = new BigInteger("797987897897987987897987979797987979");
        BigInteger b1 = new BigInteger("7676274681978975198749178174981794798");
        //b+b1;//无法直接使用+求和

        System.out.println(b.add(b1));
        System.out.println(b.subtract(b1));
        System.out.println(b.subtract(b));
        System.out.println(b.multiply(b1));
        System.out.println(b.divide(b1));
        System.out.println(b.remainder(b1));

        BigInteger b2  = new BigInteger("20");
        BigInteger b3 = new BigInteger("3");
        System.out.println(b2.remainder(b3));
    }
}

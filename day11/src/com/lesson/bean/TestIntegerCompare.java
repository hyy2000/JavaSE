package com.lesson.bean;

public class TestIntegerCompare {
        public static void main(String[] args) {
            Integer i1 = new Integer(127);
            Integer i2 = new Integer(127);
            System.out.println(i1 == i2);//flase
            System.out.println(i1.equals(i2));//true
            System.out.println("-------------");

            Integer i3 = new Integer(138);
            Integer i4 = new Integer(138);
            System.out.println(i3 == i4);//flase
            System.out.println(i3.equals(i4));//true
            System.out.println("-------------");

            Integer i7 = 127;
            Integer i8 = 127;
            System.out.println(i7 == i8);//true
            System.out.println(i7.equals(i8));//true
            System.out.println("-------------");

            Integer i9 = 128;
            Integer i10 = 128;
            System.out.println(i9 == i10);//flase
            System.out.println(i9.equals(i10));//true
//flase true flase true true true flase true
            /*-128到127是byte的取值范围,如果在这个取值范围内,自动装箱就不会新创建对象,而是从常量池中获取
               如果超过了byte取值范围就会再新创建对象
             */
            System.out.println("=====================");

            Integer a = 1;
            Integer b = 1;
            System.out.println(a == b);//true

            Integer i = 128;
            Integer j = 128;
            System.out.println(i == j);//false

            Integer m = new Integer(1);//新new的在堆中
            Integer n = 1;//这个用的是缓冲的常量对象，在方法区
            System.out.println(m == n);//false

            Integer x = new Integer(1);//新new的在堆中
            Integer y = new Integer(1);//另一个新new的在堆中
            System.out.println(x == y);//false

        }
    }


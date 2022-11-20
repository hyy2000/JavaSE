package com.lesson.bean;

public class Demo06 {
            /*
            ==  既可以比较基本数据类型也可以比较引用数据类型
            比较引用数据类型 前提:两个类型一致 (或子父类)
         */
        public static void main(String[] args) {
            Integer i = 1;
            Double d = 1.0;
            //System.out.println(i == d);//编译报错 比较引用数据类型 前提:两个类型一致 (或子父类)

            System.out.println(new Cat() == new  Animal());
        }
    }

    class Animal{}
    class Cat extends  Animal{}
    class Dog{}

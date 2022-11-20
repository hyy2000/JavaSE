package com.lesson.bean;

import java.util.Arrays;

public class Demo07 {
        /*
            方法参数的值传递
                如果存在参数列表,当这个参数传递了方法执行之后,该参数值是否发生了变化
                基本数据类型 当做参数进行传递后,该值本身不会发生改变
                引用数据类型 当做参数进行传递后,该地址值没有发生改变,可以改变属性值


            特殊情况
                包装类  当做参数进行传递,结论和基本数据类型一致
                String  当做参数进行传递,结论和基本数据类型一致
         */
        public static void main(String[] args) {

            // 基本数据类型
            int intValue = 10;
            double doubleValue = 10.0;

            // 引用数据类型
            int[] arrValue = {11,33,22,44};
            Student studentValue = new Student(10, "张三");

            // 特殊类  String和包装类
            String stringValue = "10";
            Integer integerValue = 10000;

            method(intValue,doubleValue,arrValue,studentValue,stringValue,integerValue);

            System.out.println(intValue);//不变
            System.out.println(doubleValue);//不变
            System.out.println(Arrays.toString(arrValue)); //bian
            System.out.println(studentValue);//变
            System.out.println("---------------");
            System.out.println(stringValue);// 不
            System.out.println(integerValue);// 不

        }

        private static void method(int intValue, double doubleValue, int[] arrValue, Student studentValue,String stringValue,Integer integerValue) {

            System.out.println("-----------------");
            // 对参数类别分别进行操作
            intValue += 10;
            doubleValue += 10;

            for (int i = 0; i < arrValue.length; i++) {
                arrValue[i] +=10;
            }

            studentValue.setAge(studentValue.getAge() + 10);

            stringValue += 10;
            integerValue += 10;
        }


    }

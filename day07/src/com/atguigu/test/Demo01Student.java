package com.atguigu.test;
//定义一个学生类
public class Demo01Student {

    //属性，成员变量
        String name;
        int age;
        int id;


//空参构造，无参构造
        public Demo01Student (){
            System.out.println("无参构造执行了");
        }

        public Demo01Student (String name,int age, int id){
            this.name = name;
            this.age = age;
            this.id = id;

            System.out.println("有参构造执行了");

        }

        //成员方法
        public void eat(){
            System.out.println("吃饭");
        }


    }


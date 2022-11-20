package com.atguigu.test;

public class TestStudent {
    public static void main(String[] args) {
        Demo01Student stu = new Demo01Student("张三",10086,19);//有参构造
        Demo01Student stu1 = new Demo01Student();//无参构造
        System.out.println(stu.id);//10086
        System.out.println(stu.age);//19
        System.out.println(stu.name);//张三

        Demo01Student[] stuArr= new Demo01Student[3];//创建了一个长度为3，名为stuArr的对象数组
        System.out.println(stuArr);//对象数组的地址
        System.out.println(stuArr[0]);
        System.out.println(stuArr[1]);
        System.out.println(stuArr[2]);

        stuArr[0] = new Demo01Student("jkl",18,10010);
        stuArr[1] = stu;
        stuArr[2] = stu1;


    }

}

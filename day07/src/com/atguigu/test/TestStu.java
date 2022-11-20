package com.atguigu.test;

public class TestStu {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("jkl");
        System.out.println(stu.getName());
        stu.setId(10086);
        System.out.println(stu.getId());

        Student stu1 = new Student("uzi",10010);
        System.out.println(stu1.getName());
        System.out.println(stu1.getId());

    }

}

class Student{

    //成员变量
    private String name;
    private int id;

    public Student(){
        //无参构造
    }

    public Student(String name,int id){
        this.name = name;
        this.id = id;
        //有参构造
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}

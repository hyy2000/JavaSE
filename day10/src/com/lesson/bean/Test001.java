package com.lesson.bean;

public class Test001 {
    public static void main(String[] args) {

    }
}

abstract class Person {
    /*定义一个父类 Person
    共性属性:姓名,年龄
    共性功能:睡觉
    共性抽象功能: show()  作用是描述自己是什么类,属性值是多少*/
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println("人类都可以睡觉");
    }

    abstract void show();
}

interface Eatable{
    void eat();
}

interface Sayable{
    void say();
}

interface Hearable{
    void Hear();
}

class Dump extends Person implements Hearable{

    @Override
    void show() {

    }

    @Override
    public void Hear() {

    }
}

class Deaf{}
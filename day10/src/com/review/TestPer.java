package com.review;


public class TestPer {
    public static void main(String[] args) {

        // 利用面向对象思想,使用多态的方式,调用两个子类的功能
       Person dump = new Dump("哑巴",19);
       dump.show();
       dump.sleep();
       Dump dump1 = (Dump)(dump);//向下转型
       dump1.eat();
       dump1.hear();
        System.out.println("========");
        Person deaf = new Deaf("聋子",91);
        deaf.show();
        deaf.sleep();
        Deaf deaf1 = (Deaf)(deaf);
        deaf1.eat();
        deaf1.say();

    }
}

abstract class Person {
   /* 定义一个父类 Person
    共性属性:姓名,年龄
    共性功能:睡觉
    共性抽象功能: show()  作用是描述自己是什么类,属性值是多少*/
    String name;
    int age;

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

    abstract void show();

    void sleep(){
        System.out.println("人类都要睡觉");
    }

}

interface Eat{
    void eat();
}

interface Hear{
    void hear();
}

interface Say{
    void say();
}

class Dump extends Person implements Hear,Eat{
    public Dump() {
    }

    public Dump(String name, int age) {
        super(name, age);
    }

    //哑巴类  Dumb  Person的子类

    @Override
    void show() {
        System.out.println("我是哑巴类..."+"name: "+getName()+"..."+"age: "+getAge());

    }

    @Override
    public void eat() {
        System.out.println("dump...eatable");

    }

    @Override
    public void hear() {
        System.out.println("dunmp...hearable");

    }
}

class Deaf extends Person implements Say,Eat{
    public Deaf() {
    }

    public Deaf(String name, int age) {
        super(name, age);
    }
    //聋子类  Deaf  Person 的子类

    @Override
    void show() {
        System.out.println("我是聋子类..."+"name: "+getName()+"..."+"age: "+getAge());

    }

    @Override
    public void eat() {
        System.out.println("Deaf...eatable");

    }

    @Override
    public void say() {
        System.out.println("Deaf...sayable");

    }
}
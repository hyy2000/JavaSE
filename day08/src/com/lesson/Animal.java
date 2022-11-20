package com.lesson;

public class Animal {
    public String name;
    public int age;


public Animal(){
    System.out.println("无参构造");
}

public Animal(String name,int age){
    System.out.println("有参构造");

}
    public void eat(){
        System.out.println("吃");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

}

class Cat extends Animal{

}

class Dog extends Animal{

}
class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sleep();
        System.out.println(c.age);
        System.out.println(c.name);

    }
}
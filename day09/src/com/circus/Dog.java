package com.circus;

public class Dog extends CircusAnimal{
    String name;
    int age = 20;
    @Override
    public void perform() {
        System.out.println("小狗抓老鼠");
    }

    public void eat(){
        System.out.println("小狗吃饭"+"..."+"小狗私有的方法");
    }
}

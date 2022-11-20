package com.lesson.bean;

public class TestAbstract {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.catchMouse();
        System.out.println("=======");
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.catchMouse();
        System.out.println("=====");
        Animal a = new Cat();
        a.eat();
        //a.cathMouse();

    }
}

abstract class Animal {
   abstract public void eat();

   public void sleep(){
       System.out.println("所有动物都能睡觉");
   }
}

class Cat extends Animal{

    public void eat(){
        System.out.println("小猫爱吃鱼");
    }

    public void catchMouse(){
        System.out.println("小猫捉老鼠");
    }

}

class Dog extends Animal{

    public void eat(){
        System.out.println("小狗吃肉肉");
    }

    public void catchMouse (){
        System.out.println("狗拿耗子多管闲事");
    }
}

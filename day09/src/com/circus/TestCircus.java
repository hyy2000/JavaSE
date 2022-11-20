package com.circus;

public class TestCircus {
    public static void main(String[] args) {

        CircusAnimal ca = new Tiger();
        ca.perform();
        CircusAnimal ca1 = new Bear();
        ca1.perform();
        CircusAnimal ca2 = new Dog();
       // ca2.eat;不能访问子类特有的成员
        /*编译时，只能调用父类声明的方法，不能调用子类扩展的方法；*/
        ca2.perform();
        System.out.println(ca2.age);
    }
}

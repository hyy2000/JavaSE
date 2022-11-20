package com.review;

public class TestSuperman {
    public static void main(String[] args) {
        Person p = new Superman();
        System.out.println(p.name);
        System.out.println(p.age);
        p.eat();
       // p.fly();
        /*多态的好处
        1> 提高代码的复用性
        2> 提高了代码的扩展性
        3> 可以当作形式参数,可以接收任意子类对象

        多态的弊端
        不能访问子类特有的成员(成员变量和成员的方法)
*/
        Superman sp = new Superman();
        System.out.println(sp.age);
        System.out.println(sp.name);
        sp.fly();
    }
}
class Person {
    String name = "小山";
    int age = 18;

    public void eat(){
        System.out.println("人一天吃三顿饭，小山吃五吨");
    }

}

class Superman extends Person {
    String name = "小小小山";
    int age = 501;

    public void eat(){
        System.out.println("超人不吃饭");

    }
    public void fly(){
        System.out.println("飞出去救人");
    }
}

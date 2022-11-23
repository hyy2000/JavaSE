package com.lesson;
/*1.控制类的创建，不让其他类来创建本类的对象。
2.在本类中定义一个本类的对象。
3.提供单例对象的公共访问方式。 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton.getSingleton();

    }
}

class Singleton{
    private Singleton(){}
    private static final Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
}

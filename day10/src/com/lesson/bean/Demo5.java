package com.lesson.bean;
public class Demo5 {

    /*
    接口
        interface   特殊的事物
        设计理念
            扩展功能  (多多益善)
         格式
            修饰符 interface 接口名{}

          成员
            构造:没有构造   不能实例化
            成员变量:默认是public static final  常量
            成员方法:JDK1.8之前 默认的 public abstract  抽象方法
                        JDK1.8之后  增加 静态的,默认
                        JDK1.9之后  增加  私有
         设计理念
            扩展
     */
    public static void main(String[] args) {

        InterCC interCC = new InterImpl();
        interCC.method1();

    }
}

interface InterCC{

    public static final int NUM1 = 10;
    int NUM2 = 20;

    public abstract void method1();
    void method2();
}

interface  InterDD{
    void method3();
}

class InterImpl implements InterCC,InterDD{

    @Override
    public void method1() {
        System.out.println(NUM1);
        System.out.println(NUM2);


    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

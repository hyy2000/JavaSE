package com.review;

public class Test001 {
    public static void main(String[] args) {
      /*  Fu2 fu = new Fu2();
        fu.method2();
        System.out.println("-----------");
        Fu2 fu2 = new Fu2();
        fu2.method2();


        fu 静态代码块
        fu 非静态代码
        fu 构造器
        fu method2

        fu非静态代码块
        fu构造
        fu method2，非静态方法
*/

        System.out.println("==========================================");
        Zi zi = new Zi();
       // zi.method3();
        zi.method4();

        /*
        * fu 静态代码块
        * zi 静态代码块
        * fu 非静态代码块
        * fu gouzao
        * zi 非静态代码块
        *
        * */



    }
}

class Fu2 {

    static {
        System.out.println("fu===静态代码块");
    }

    {   // 普通的代码块,非静态代码块 加载时机 优先于构造器  属于对象
        System.out.println("fu===非静态代码块");
    }

    public Fu2(){   // 属于对象  随着对象的创建而创建   每创建一个 创建一次
        System.out.println("fu===构造");
    }

    public static void method1(){
        System.out.println("fu===静态方法");

    }

    public void method2(){
        System.out.println("fu===非静态方法");
    }

}

class Zi extends Fu2{
    public Zi(){
        System.out.println("zi===构造");
    }

    static {
        System.out.println("zi====静态代码块");
    }

    {
        System.out.println("zi====非静态代码块");
    }

    static void method3(){
        System.out.println("zi====静态方法");
    }

    void method4(){
        System.out.println("zi====非静态方法");

    }
}

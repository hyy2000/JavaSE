package com.review;

public class TestFather {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();
        MyClass m = new MySub();
        m.method(s);
        //m.method(d);


    }
}
class MyClass {
    public void method (Father f){
        System.out.println("fu--------Father");
    }

    public void method (Son s){
        System.out.println("fu---------Son");
    }

}

class MySub extends MyClass{
    public void method(Father f){
        System.out.println("sub--------Father");
    }

    public void method(Daughter d){
        System.out.println("sub --------Daughter");

    }

}

class Father{

}
class Son extends Father{

}
class Daughter extends Father{

}

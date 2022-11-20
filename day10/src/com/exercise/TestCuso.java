package com.exercise;

public class TestCuso {
    public static void main(String[] args) {
        //ZiTest zi = new ZiTest();
        ZiTest zi = new ZiTest("zhang",19);


    }
}

class FuTest {
    String name;
    int age;
    public FuTest() {
        System.out.println("fu ===空参构造器");
    }

    public FuTest(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("fu ===有参构造器");
    }
}

class ZiTest extends FuTest{
    public ZiTest() {

        System.out.println("zi ===空构造器");
    }

    public ZiTest(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("zi ===有参构造器");
    }
}



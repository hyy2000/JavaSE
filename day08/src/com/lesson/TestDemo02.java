package com.lesson;

public class TestDemo02{

    public static void main(String[] args) {

        Demo02 demo02 = new Demo02();
        System.out.println(demo02);
    }
}



class Demo02 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Demo02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

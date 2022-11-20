package com.lesson;

public class TestPhone {
    public static void main(String[] args) {
        Phone2 ph2 = new Phone2();
        ph2.call();
        ph2.sendMessge();
        ph2.photo();


        System.out.println("============");
        Phone3 ph3 = new Phone3();
        ph3.call();
        ph3.sendMessge();
        ph3.photo();
        ph3.play();


    }
}

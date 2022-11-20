package com.lesson.bean;

public class Test {
    public static void main(String[] args) {
        new A(){
            @Override
            public void a() {

            }
        };

    }
}

interface A{
    void a();
}

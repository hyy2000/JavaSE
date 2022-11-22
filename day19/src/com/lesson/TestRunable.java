package com.lesson;

public class TestRunable {
    public static void main(String[] args) {
        MyRunmable mr = new MyRunmable();
        new Thread(mr,"第二种方式=====").start();

    }
}

class MyRunmable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

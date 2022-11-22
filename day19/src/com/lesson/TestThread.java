package com.lesson;

public class TestThread {
    public static void main(String[] args) {

        MyThread mt = new MyThread("第一种方式创建线程");
        mt.start();
    }
}
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"-----"+i);
        }
    }
}

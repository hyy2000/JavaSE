package com.lesson;

public class TestSync02 {
    public static void main(String[] args) {
        Chorus1 c = new Chorus1();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    c.sing();
                }

            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                while (true) {
                    c.sing2();
                }
            }
        }.start();

    }

}
class Chorus1 {
    public synchronized void sing() {
//        非静态的同步方法的锁对象是this

            System.out.print("平");
            System.out.print("凡");
            System.out.print("之");
            System.out.print("路");
            System.out.println();

    }

    public synchronized void sing2() {

            System.out.print("沉");
            System.out.print("默");
            System.out.print("是");
            System.out.print("金");
            System.out.println();
    }
}

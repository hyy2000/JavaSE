package com.lesson;

public class Test06 {
    /*定义一个合唱团类Chorus,其中有两个功能:
	功能一:演唱<平凡之路>
	功能二:演唱<沉默是金>
请创建两个线程,线程一的任务为:无限演唱<平凡之路>,线程二的任务为:无限演唱<沉默是金>*/
    public static void main(String[] args) {

        Chorus1 c= new Chorus1();

        new Thread("线程1") {
            @Override
            public void run() {
                while (true) {
                    c.sing();
                   // System.out.println(getName());
                }//平凡之路
            }
        }.start();


        new Thread("线程2") {
            @Override
            public void run() {
                while (true) {
                 c.sing2();
                   // System.out.println(getName());

                }//沉默是金
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}

class Chorus {
    public void sing() {

        synchronized (this){

            System.out.print("平");
            System.out.print("凡");
            System.out.print("之");
            System.out.print("路");
            System.out.println();
        }
    }

    public void sing2() {
        synchronized (this){

            System.out.print("沉");
            System.out.print("默");
            System.out.print("是");
            System.out.print("金");
            System.out.println();
        }
    }
}

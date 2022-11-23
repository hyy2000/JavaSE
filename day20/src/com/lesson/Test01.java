package com.lesson;
 /*
    需求
        请让两个演唱队,执行演唱任务时交替执行,演唱顺序为121212....
        分析
            指挥者 flag  int
                对应关系 1  A   2  B
                交替执行
                    A 默认先执行  flag = 1;(B 等待)
                        A 完毕 flag = 2  告诉B
                    B 执行(A 等待)
                       B 完毕 flag = 1 告诉A
                       ...
           线程通信机制(等待唤醒机制)

           线程通信机制  (等待唤醒)
            * 如果希望线程等待, 就调用wait()
            * 如果希望唤醒等待的线程, 就调用notify();   随机唤醒等待的线程

            注意:这两个方法必须在同步代码中执行, 并且使用同步锁对象来调用

     */

public class Test01 {
    public static void main(String[] args) {
        Chorus2 c = new Chorus2();
        new Thread(){
            @Override
            public void run() {
               while (true){
                   try {
                       c.sing1();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                while (true){
                    while (true){
                        c.sing2();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    c.sing3();
                }
            }
        }.start();



    }


}

class Chorus2 {

    int flag = 1;
    public  void sing1() throws InterruptedException {

        if (flag != 1){
            Chorus2.class.wait();
        }
        synchronized (Chorus2.class){
            System.out.print("平");
            System.out.print("凡");
            System.out.print("之");
            System.out.print("路");
            System.out.println();

        }
        flag = 2;
        Chorus2.class.wait();



    }

    public  void sing2() {

        synchronized (Chorus2.class){
            System.out.print("沉");
            System.out.print("默");
            System.out.print("是");
            System.out.print("金");
            System.out.println();
        }

    }

    public  void sing3() {

        synchronized (Chorus2.class){
            System.out.print("一");
            System.out.print("路");
            System.out.print("向");
            System.out.print("北");
            System.out.println();
        }

    }

}

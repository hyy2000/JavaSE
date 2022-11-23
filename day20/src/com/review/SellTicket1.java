package com.review;
/*
      需求:
        模拟电影院的卖票过程,假设要播放的电影是 “葫芦娃大战奥特曼”，电影院有四个售票窗口(多线程模拟),同时售卖100张电影票(票号1-100)
        请在控制台输出当前售票窗口销售的票号
        分析:
        售票窗口 --> 线程模拟
        任务 -- > 售票
	*/

import java.awt.*;

public class SellTicket1 {
    public static void main(String[] args) {

        windows1 w1 = new windows1("线程1");
        windows1 w2 = new windows1("线程2");
        windows1 w3 = new windows1("线程3");
        windows1 w4 = new windows1("线程4");

        w1.start();
        w2.start();
        w3.start();
        w4.start();
    }
}

class windows1 extends Thread {
    private static int ticket = 1000;


    public windows1(String name) {
        super(name);
    }

    @Override
    public void run() {

            while (true) {

                synchronized (windows1.class) {
                    if (ticket == 0) {
                    break;
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(getName() + "剩余票数为：" + ticket--);
            }


        }

    }
}

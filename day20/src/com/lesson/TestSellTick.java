package com.lesson;
/*模拟电影院的卖票过程,假设要播放的电影是 “葫芦娃大战奥特曼”，电影院有四个售票窗口(多线程模拟),同时售卖100张电影票(票号1-100)
请在控制台输出当前售票窗口销售的票号
提示:
* 多线程并发操作同一数据时, 就有可能出现线程安全问题(多窗口销售同一张票)
* 使用同步技术可以解决这种问题, 把操作数据的代码进行同步, 不要多个线程一起操作
如果两段代码是同步的, 那么同一时间只能执行一段, 在一段代码没执行结束之前, 不会执行另外一段代码.*/

public class TestSellTick {
    public static void main(String[] args) {
        sellT s1 = new sellT();
        sellT s2 = new sellT();
        sellT s3 = new sellT();
        sellT s4 = new sellT();

        new Thread(){

        }.start();


    }
}

class sellT {

    synchronized void sell() {

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }
}




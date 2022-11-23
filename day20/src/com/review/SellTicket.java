package com.review;

public class SellTicket {
    public static void main(String[] args) {
        windows w1 = new windows();
        windows w2 = new windows();
        windows w3 = new windows();
        windows w4 = new windows();

        new Thread(w1).start();
        new Thread(w2).start();
        new Thread(w3).start();
        new Thread(w4).start();

    }



}

class windows implements Runnable {
    private  static int ticket = 100;


    @Override
    public void run() {

        synchronized (windows.class) {
            while (true) {
                if (ticket == 0) {
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("剩余票数为：" + ticket--);

            }
        }


    }
}
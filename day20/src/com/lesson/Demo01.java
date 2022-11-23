package com.lesson;

public class Demo01 {
    public static void main(String[] args) {
        windows w1 = new windows();
        windows w2 = new windows();
        windows w3 = new windows();
        windows w4 = new windows();

        w1.start();
        w2.start();
        w3.start();
        w4.start();

    }
}

class windows extends Thread{

    private static int ticket =100;
    @Override
    public  synchronized void run() {

        synchronized (windows.class){
            while (true){
                if (ticket == 0){
                    break;
                }else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("剩余票数为："+ticket--);

                }
            }
        }

    }
}

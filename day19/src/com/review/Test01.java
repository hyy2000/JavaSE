package com.review;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread("线程一 ：=====") {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(getName()+i);

                }
            }
        };

        thread.start();


        Thread thread1 = new Thread("线程二:") {
            @Override
            public void run() {

                for (int i = 0; i < 1000; i++) {
                    System.out.println(getName()+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();


    }
}

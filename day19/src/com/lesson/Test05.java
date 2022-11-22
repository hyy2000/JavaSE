package com.lesson;

public class Test05 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                //System.out.println(this.getName());
                for (int i = 0; i < 200; i++) {
                    System.out.println(this.getName()+"==="+i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName()+"==="+i);
                }
            }
        }).start();
    }
}

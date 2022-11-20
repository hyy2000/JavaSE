package com.atguigu.test;

public class Phone {

    //成员变量，
    // 成员方法()

    public int price;
    public String brand;

    public void call(String str){
        System.out.println("call "+ str);
    }
    public void send(String str){
        System.out.println("send messege to "+str);
    }
    public void internet(){
        System.out.println("恭喜你成功连接到互联网");
    }

}

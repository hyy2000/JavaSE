package com.lesson;

public class Phone {
    String brand;
    int price;

    public Phone(){
        System.out.println("一代手机的空参构造");
    }

    public Phone (String bran,int price){
        this.brand = brand;
        this.price = price;
        System.out.println("一代手机的有参构造");
    }

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessge(){
        System.out.println("发短信");
    }

}

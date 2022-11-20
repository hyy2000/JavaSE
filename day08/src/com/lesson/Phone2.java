package com.lesson;

public class Phone2 extends Phone{

    public Phone2(){
        super();
        System.out.println("二代手机的空参构造");
    }
    public Phone2(String brand,int price){
        this.brand = brand;
        this.price = price;
        System.out.println("二代手机的有参构造");
    }

    @Override
    public void call() {
        System.out.println("二代手机打电话功能");
    }

    public void photo(){
        System.out.println("拍照");
    }

}

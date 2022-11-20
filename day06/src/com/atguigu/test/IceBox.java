package com.atguigu.test;

public class IceBox {

    String brand = "Haier";
    String color ="white";

    public void open(){
        System.out.println("open the door");
    }

    public void putElephant(Elephant e){
        System.out.println(" 把"+e.age+"岁的大象"+e.name +"放进冰箱");
    }

    public void close(){
        System.out.println("close the door");
    }
}


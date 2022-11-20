package com.atguigu.test;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.price = 8848;
        ph.brand = "HUAWEI";
        System.out.println(ph.price);
        System.out.println(ph.brand);

        ph.call("jack");
        ph.send("mark");
        ph.internet();
    }
}

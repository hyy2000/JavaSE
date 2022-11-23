package com.review;
  /*
    单例设计模式
        如何保证类在内存中只有一个对象
        1.控制类的创建，不让其他类来创建本类的对象。
        2.在本类中定义单例对象。
        3.提供单例对象的公共访问方式。
	*/

public class SignleTon {

    private SignleTon(){}

    static SignleTon signleTon = new SignleTon();

    public static SignleTon getSignleTon() {
        return signleTon;
    }
}



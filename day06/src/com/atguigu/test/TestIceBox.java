package com.atguigu.test;

public class TestIceBox {

    public static void main(String[] args) {
        Elephant e= new Elephant();
        e.name= "jack";
        e.age = 19;
        IceBox ice = new IceBox();
       // ice.putElephant(e);

        ice.putElephant(new Elephant());

    }

}

package com.atguigu.test;

public class TestCar {
    public static void main(String[] args) {
        Car acar = new Car();
        acar.run();
        acar.num = 4;
        acar.color= "white";
        acar.run();

        Car car1 = new Car("white",20);
        Car car2 = new Car ("10",2);

        car1.run();
        car2.run();
    }

}
package com.atguigu.test;

public class Car {


        String color;
        int num;

        public void run(){
            System.out.println(color +"......"+num);
        }

        public Car(String color, int num) {
            this.color = color;
            this.num = num;
        }

        public Car(String color) {
            this.color = color;
        }

        public Car() {
        }
    }



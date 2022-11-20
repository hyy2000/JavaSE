package com.lesson.bean;

public enum Num {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

class TestNum{
    public static void main(String[] args) {
        Num monday = Num.MONDAY;
        System.out.println(monday);

        //Num n = new Num();构造器是私有的
        System.out.println(monday.toString());
    }
}

package com.lesson.bean;

public class Season {
    public static final Season SPRING = new Season();
    public static final Season SUMMER = new Season();
    public static final Season AUTUMN = new Season();
    public static final Season WINTER = new Season();
    private Season(){

    }

    public String toString(){
        if(this == SPRING){
            return "春";
        }else if(this == SUMMER){
            return "夏";
        }else if(this == AUTUMN){
            return "秋";
        }else{
            return "冬";
        }
    }


}
class TestSeason {
    public static void main(String[] args) {
        Season spring1 = Season.SPRING;
        System.out.println(spring1);

        Season spring2 = Season.SPRING;
      System.out.println(spring1 == spring2);// true 有限的几个对象
    }
}

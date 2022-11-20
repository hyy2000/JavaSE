package com.review;

class Circus {
    public void perform(CircusAnimal ca){
        ca.perform();
    }

}

class CircusAnimal {
    public void perform(){

    }
}

class Tiger extends CircusAnimal{
    public void perform(){
        System.out.println("老虎钻火圈");
    }
}

class Cat extends CircusAnimal{
    public void perform(){
        System.out.println("小猫馋嘴");
    }
        }

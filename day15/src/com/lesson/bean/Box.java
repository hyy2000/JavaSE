package com.lesson.bean;

public class Box <T>{
    private T element;

    public T getElement(){
        return  element;

    }

    public void setElement(T element){
        this.element = element;
    }
}

class TestBox{
    public static void main(String[] args) {
        Box<String> box = new Box();
        box.setElement("hhh");
        System.out.println(box.getElement());

        Box<Integer> box1 = new Box();
        box1.setElement(369);
        System.out.println(box1.getElement());
    }
}

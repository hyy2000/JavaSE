package com.preview;

public class TestCircus {
    public static void main(String[] args) {
        Circus c = new Circus();
        c.perform(new Tiger());
        c.perform(new Bear());
        c.perform(new Cat());
        c.perform(new Dog());

        CircusAnimal c1 = new Tiger();
        c1.perform();
        //t.eat();不能调用子类的扩展方法
        Tiger t = new Tiger();
        t.eat();
    }
}

package com.lesson.bean;

public interface InterF <F> {
   void method(F f);
}

class InterFImp <F> implements InterF <F>{
    @Override
    public void method(F f) {
        System.out.println(f);
    }
    }
class InterFImp1 implements  InterF <String>{

    @Override
    public void method(String string) {
        System.out.println(string);
    }
}

class TestInterF{
    public static void main(String[] args) {
        InterFImp<String> stringInterFImp = new InterFImp<String>();
        InterFImp1 interFImp1 = new InterFImp1();

    }
}
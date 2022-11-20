package com.review;

public abstract class Fu {
    private String name;
    private int age;
    public Fu(){
        System.out.println("fu=====无参构造");
    }

    public Fu(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("fu=====有参构造");
    }

}

class ZiTest extends Fu {

    static {
        System.out.println("静态内部类");
    }

    public ZiTest() {
        super();
        System.out.println("zi=====无参构造");
    }

    public ZiTest(String name, int age) {
      super(name,age);
        System.out.println("zi=====有参构造");
    }
}
class TestMain{
    public static void main(String[] args) {
        ZiTest zi1 = new ZiTest("jjj",19);


    }
}

package com.review;

public class TestStatic {
    public static void main(String[] args) {
       // CC c = new CC();
       // System.out.println("=======");
        DD d = new DD();



    }
}

class CC {
    public CC() {
        System.out.println("父类构造");
    }

    {
        System.out.println("fu ===== 非静态代码块");
    }
    static {
        System.out.println("fu ===== 静态代码块");
    }

}

class DD extends CC{
    public DD(){
        System.out.println("子类构造");
    }

    {
        System.out.println("zi ===== 非静态代码块");
    }
    static {
        System.out.println("zi ===== 静态代码块");
    }
}

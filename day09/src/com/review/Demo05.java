package com.review;

public class Demo05 {
    public static void main(String[] args) {
        AA a  = new AA();

        BB b = new BB();
    }
}
class  AA{

    public AA(){
        System.out.println("---------------fu");
    }

    {
        System.out.println("父类代码块");

    }

    static{
        System.out.println( "父类静态代码块");
    }



}
class BB extends  AA{



    static {
        System.out.println("00000000000000");
    }

    {
        System.out.println("----zi");
    }
}
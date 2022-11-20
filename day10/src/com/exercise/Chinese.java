package com.exercise;

public class Chinese {
    private static String name;
    private static String country;

    public Chinese(){
        System.out.println("无参构造");
    }

    public Chinese(String name) {
        this.name = name;
        System.out.println("有参构造器");
    }
//非静态代码块
//	每创建一个对象实例,就会被执行一次,优先于构造器执行
    {
        System.out.println("非静态代码块，country = "+country);

    }
// 静态代码块
//	在类初始化时执行，只执行一次
//	静态代码块的执行优先于非静态代码块和构造器
    static {
        country = "中国";
        System.out.println("静态代码块");
    }

}
class TestBlock{
    public static void main(String[] args) {
        Chinese c1 = new Chinese("zhangsan");
        //1.静态代码块
        //2.非静态代码块
        //3.构造器
        System.out.println("=======");
        Chinese c2 = new Chinese("lisi");
        System.out.println("=======");
        Chinese c3 = new Chinese();
    }
}
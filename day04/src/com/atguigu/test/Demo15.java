package com.atguigu.test;
/*
世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，
假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class Demo15 {
    public static void main(String[] args) {
        int zh = 1;
        double sh = 8848.86*10*100*10;
        int count = 0;
        while (zh<sh){
            zh*=2;
            count++;
        }
        System.out.println(count);
        aPrint();

    }

    public static void aPrint(){
        int count = 0;

        //定义珠穆朗玛峰的高度
        int zf = 8848860;//单位毫米

        //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
        for(double paper = 0.1; paper < zf;  paper *= 2){
            //在循环中执行累加，对应折叠了多少次
            count++;
        }

        //打印计数器的值
        System.out.println("需要折叠：" + count + "次");
    }
}

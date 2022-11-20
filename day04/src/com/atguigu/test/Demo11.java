/*
需求4:定义一个方法,对应输出nn乘法表
 */
package com.atguigu.test;

public class Demo11 {
    public static void main(String[] args) {
        printMultiTable(9);

    }

    public static void printMultiTable(int a){
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j +"*"+i +"=" + i*j + "\t");

            }
            System.out.println();

        }
    }
}

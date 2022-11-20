/*
需求3:定义一个方法,	对应画出m行n列的星星图案
 */
package com.atguigu.test;

public class Demo10 {

    public static void main(String[] args) {
        aPrint(3,4);

    }

    public static void aPrint(int m,int n){

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }




}

/*
需求2:定义一个方法,	判断两个整数是否相等
 */
package com.atguigu.test;

public class Demo09 {
    public static void main(String[] args) {
        System.out.println(aequal(5,6));
        System.out.println(aequal(8,8));
        System.out.println(aequal(7, 7));//快捷键：aequal(7,7).sout

    }

    public static boolean aequal(int a,int b){
       /* if (a == b) {
            return true;
        } else return false;*/

        return a == b;
    }



}

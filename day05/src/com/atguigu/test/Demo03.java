package com.atguigu.test;

public class Demo03 {

    public static void main(String[] args) {
        int [] arr = {2,9,1,8};

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>temp){
                temp = arr[i];
            }

        }
        System.out.println(temp);

    }
}

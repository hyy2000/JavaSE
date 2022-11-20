package com.atguigu.test;

public class Demo02 {
    public static void main(String[] args) {
        int [] arr ={3,5,7,9,11};
        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];

        }

        System.out.println(sum);
    }


}

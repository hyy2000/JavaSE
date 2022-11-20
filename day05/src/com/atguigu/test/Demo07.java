package com.atguigu.test;

public class Demo07 {
    public static void main(String[] args) {
        int [] arr = {21, 67, 88, 52, 19};
        //0 1, 0 2, 0 3, 0 4,   4次
        //1 2, 1 3, 1 4,        3次
        //2 3, 2 4,             2次
        //3 4,                  1次
        /*
        - 交换的次数
        - 交换的内容，和谁交换：arr[i]和arr[j]
        - 交换的条件: arr[i]>arr[j]
        - 交换的方式: temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
         */

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}

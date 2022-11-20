package com.atguigu.test;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {999,34,2,24,71,45};
        /*
        - 本质：作比较，做交换
        - 交换次数：0 1，1 2，2 3, 3 4，4 5，   交换5次
                  0 1，1 2，2 3, 3 4，        4次
                  0 1，1 2，2 3
                  0 1，1 2，
                  0 1
        - 交换内容：
        - 交换条件：
         */

        for (int i = 0;i<arr.length-1;i++){

            for (int j = 0;j<arr.length-1-i;j++){

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
        }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",  ");

        }

    }
}

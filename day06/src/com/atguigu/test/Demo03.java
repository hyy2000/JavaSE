package com.atguigu.test;

public class Demo03 {
    public static void main(String[] args) {

        int[] arr = {9,5,4,1,0,19};
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
            System.out.println(arr[i]);

        }
    }
}

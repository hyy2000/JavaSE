package com.atguigu.test;

public class Demo05 {
    public static void main(String[] args) {
        int [] arr1 = {9,3,7,2,18,19};
        for (int i = 0;i<arr1.length-1;i++){
            for (int j = 0;j<arr1.length-1-i;j++){
                if (arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        for (int i : arr1) {
            System.out.println(i);

        }

    }

}

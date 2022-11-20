package com.atguigu.test;

public class Demo06 {
    public static void main(String[] args) {
        int [] arr = {3,9,18,45};
        System.out.println(getIndex(arr,19));

    }

    public static int getIndex(int[] arr,int num){

        int min = 0;
        int max = arr.length-1;
        int mid = (min+max) >>1;

        while (true){

            if (min>max){
                return -1;
            }

            if (num > arr[mid]){
                min = mid+1;
                mid = (min+max)>>1;
            }else if(num<arr[mid]){
                max = mid-1;
                mid = (min+max)>>1;
            }else {
                return mid;
            }
        }
    }

}

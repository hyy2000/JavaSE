package com.atguigu.test;

public class Demo02 {
    public static void main(String[] args) {

        int[] arr = new int[] {11,22,33,44,55,66,77,88};
        reArr(arr);
        
    }

    //实现思想：数组对称位置的元素互换。
    //如原数组元素为:11,22,33,44,55
    //反转后,数组元素为:55,44,33,22,11
    public static void reArr(int [] arr){
        int max = arr.length-1;
        for (int i= 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[max-i];
            arr[max-i] = temp;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

    }

}

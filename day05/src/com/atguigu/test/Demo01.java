package com.atguigu.test;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int arr2[] = new int[6];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println("==========");



        int[] arr1 = {9,4,3,2,6};
        System.out.println(arr1[2]);
        System.out.println("==========");

        //for循环输出数组元素
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+", ");
        }
        System.out.println();
        System.out.println("==========");

        //foeach输出数组元素
        for (int a:arr1
             ) {
            System.out.print(a + ", ");
            
        }



    }
}

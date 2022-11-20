package com.atguigu.test;

public class Demo09 {
    public static void main(String[] args) {
        int[] arry = {2,9,4,6,8,5};
        bubbleSort(arry);//
        System.out.println();
        System.out.println("=======");
        selectSort(arry);

    }

    //定义一个冒泡排序的方法
    public static void bubbleSort(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {

                if (arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");

        }


    }
//定义一个选择排序算法的方法

    public static void selectSort(int [] arr){

        for (int i = 0;i<arr.length-1;i++){

            for (int j=i+1 ;j<arr.length-1;j++){

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }
        }

        /*for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }*/
        printArry(arr);

    }
//定义一个遍历数组的函数；
    public static void printArry(int [] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

    }

}


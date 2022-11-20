package com.atguigu.test;

public class Demo01 {
    public static void main(String[] args) {

        int [] arry = {99,3,12,37};
        bubbleSort(arry);
        System.out.println();
        System.out.println("============");

        selectSort(arry);



    }

    public static void printArry(int [] arry){
        for (int i = 0; i < arry.length; i++) {

            System.out.print(arry[i]+ ",  ");
        }
    }

    public static void bubbleSort(int [] arry){
        for (int i = 0;i<arry.length-1;i++){

            for (int j = 0; j < arry.length-1-i; j++) {

               if (arry[j]>arry[j+1]){
                   /*int temp = arry[j];
                   arry[j] = arry[j+1];
                   arry[j+1] = temp;*/
                   swap(arry,j,j+1);
               }
            }
        }
        printArry(arry);
    }

    public static void selectSort(int[] arry){
        for (int i = 0;i<arry.length-1;i++){

            for (int j = i+1;j<arry.length;j++){
                if (arry[i]>arry[j]){
                    swap(arry,i,j);

                }
            }
        }
        printArry(arry);

    }


    public static void swap(int [] arry,int i,int j){
        int temp = arry[j];
        arry[j] = arry[i];
        arry[i] = temp;
    }



}


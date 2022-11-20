package com.atguigu.test;

public class Demo08 {
    public static void main(String[] args) {

        int[] a = {2,9,4,6,8,5};//a.length = 6;
        System.out.println("a.length = "+ a.length);

        for (int i = 0;i<a.length-1;i++){

            for (int j = 0;j<a.length -1 -i;j++){

                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i= 0;i<a.length-1;i++){
            System.out.println(a[i]);
        }

    }
}

package com.atguigu.test;

public class TestRadom {

        public static void main(String[] args) {
            int[] arr = new int[10];

            //随机产生10个[1,100]的偶数
            for (int i = 0; i < arr.length; i++) {
            /*
            Math.random()：[0,1)的小数
            Math.random()*50：[0,50)的小数
            Math.random()*50+1：[1,51)的小数
            (int)(Math.random()*50 + 1)：[1,51)的整数，即[1,50]的整数
            (int)(Math.random()*50 + 1) * 2 ： [1,100]的偶数
             */
                arr[i] = (int)(Math.random()*50+1)*2;
            }

            //排序
            for (int i = 1; i < arr.length; i++) {
                for(int j=0; j<arr.length - i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            //显示结果
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }

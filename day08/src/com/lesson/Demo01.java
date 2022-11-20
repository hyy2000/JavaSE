package com.lesson;

import java.util.Arrays;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0;i<arr.length;i++){
            arr[i] = r.nextInt(10);
        }

        for (int n:arr
             ) {
            System.out.println(n);

        }

        System.out.println(Arrays.toString(arr));
    }


}

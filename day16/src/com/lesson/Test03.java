package com.lesson;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7};
        for (int i : arr) {
            i = 999;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

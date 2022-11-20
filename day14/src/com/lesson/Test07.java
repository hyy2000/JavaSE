package com.lesson;

import java.util.Arrays;

public class Test07 {
    /*  public static String toString(int[] a)
        public static void sort(int[] a)
        public static int binarySearch(int[] a,int key)
*/
    public static void main(String[] args) {
        int[] arr = {5,45,7,8,1,17,13};
        Arrays.sort(arr);

        //System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 9));


    }
}

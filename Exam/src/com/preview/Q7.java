package com.preview;
/*7.	编写代码实现两个变量值交换，int m = 3, n =5;*/
public class Q7 {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = "+m);
        System.out.println("n = "+n);

        //
        int a = 3;
        int b = 5;
        int i = a ^ b;
        System.out.println(i);


    }
}

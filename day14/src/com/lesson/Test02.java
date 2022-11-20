package com.lesson;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
    //构造方法
    // public Random()
    //public Random(long seed)//参数为种子
    /*
    常用方法：
      public int nextInt()返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
      public int nextInt(int n)(重点掌握)返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
      其他产生随机数的方法:
      boolean nextBoolean():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 boolean 值。      - void nextBytes(byte[] bytes):生成随机字节并将其置于用户提供的 byte 数组中。
      double nextDouble():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 double 值。
      float nextFloat():返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 float 值。
     double nextGaussian():返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的 double 值，其平均值是 0.0，标准差是 1.0。
     long nextLong():返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值。*/
    public static void main(String[] args) {
        Random r = new Random();
       /* int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextBoolean());

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextDouble());

        }*/

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextGaussian());

        }


    }
}

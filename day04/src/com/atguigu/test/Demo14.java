package com.atguigu.test;
/*
5个一行输出1-100之间的偶数
输出1-100偶数，每5个一行，一行中的每个数字之间使用逗号分隔
 */
public class Demo14 {
    public static void main(String[] args) {

        aPrint();
    }

    public static void aPrint(){
        int count = 0;//计数器，记录能偶数个数

        for (int i = 1; i <=100 ; i++) {
            if (i%2 == 0){
                System.out.print(i+",");
                count++;
            }

            if (count == 5){
                System.out.println();
                count = 0;//清零计数器
            }

        }


    }


}


package com.preview;

public class Q1 {
    /*1.	用最有效的的方法算出2乘以8等于几*/
    public static void main(String[] args) {
        //左乘，右除，
        //8=2^3
        /*
        * 运算规则：左移几位就相当于乘以2的几次方
        * 右移类似于除以2的n次，如果不能整除，**向下取整***/

        /* 无符号右移：>>>
                运算规则：往右移动后，左边空出来的位直接补0，不看符号位
                正数：和右移一样
                负数：右边移出去几位，左边补几个0，结果变为正数*/
        int i = 2 << 3;
        System.out.println(i);

    }
}

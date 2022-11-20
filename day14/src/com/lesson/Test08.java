package com.lesson;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 ");

        if (sc.hasNextInt()) {
            //判断输入的内容是否是int类型，返回值类型为boolean类型
            int i = sc.nextInt();
            System.out.println(i);
        }else {
            System.out.println("输入错误");
        }

    }

}

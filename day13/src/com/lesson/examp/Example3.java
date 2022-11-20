package com.lesson.examp;

public class Example3 {
    /*需求：把数组中的数据按照指定个格式拼接成一个字符串
    举例：   int[] arr = {1,2,3};
    输出结果：    "[1, 2, 3]"*/
    public static void main(String[] args) {

        int [] arr = {1,2,3};
        StringBuilder str = new StringBuilder("[" + arr[0]+", ");

        for (int i = 1; i < arr.length; i++) {

            if (i == 2){
                str.append(arr[2]+"]");
            }else {
                str.append(arr[i]+", ");
            }

        }

        System.out.println(str);


    }
}

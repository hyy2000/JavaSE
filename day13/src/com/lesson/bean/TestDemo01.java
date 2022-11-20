package com.lesson.bean;

public class TestDemo01 {
/*    【群发消息】使用StringBuilder完成

    需求：把数组中的数据按照指定个格式拼接成一个字符串
    举例：
    int[] arr = {1,2,3};
    输出结果：
            "[1, 2, 3]"*/
public static void main(String[] args) {
     int [] arr = {1,2,3,5,6,7,8,8,9,1};

  /*   StringBuilder sb = new StringBuilder();
     StringBuilder sb1 = new StringBuilder("[");

    for (int i = 0; i < arr.length; i++) {

        if (i == 0){
            sb = sb1.append(arr[i]+", ");
        } else if (i == arr.length-1){
            sb = sb.append(arr[i]+" ]");

        }else {
            sb =   sb.append(arr[i]+", ");
        }

        }*/

    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;i<arr.length;i++){
        if (i == arr.length-1){
            sb.append(arr[i]+"]");

        }else sb.append(arr[i]+"， ");

    }

    System.out.println(sb);

}

}

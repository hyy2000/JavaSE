package com.lesson.bean;

public class TestTryCatch {
    public static void main(String[] args) {

        int[] arr  = {9,2,5,6,8,0};
        try{ System.out.println(arr[9]);
            System.out.println("我执行了吗111");
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("我执行了吗222");
        }
        System.out.println("我执行了吗333");


    }
}



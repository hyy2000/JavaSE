package com.lesson;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("aa");
        list.add("dd");
        list.add("ee");
        list.add("aa");

        //通过list.get(i)遍历集合，集合长度可以调用list.size()方法获取
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=======================");

        //通过迭代器遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=======================");


        //通过增强for循环遍历集合
        for (String s : list) {
            System.out.println(s);
        }


    }
}

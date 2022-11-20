package com.lesson;

import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);


        list.addFirst(999);
        list.addLast(666);
        list.add(888);
       list.remove();
       list.set(0,0);
        //System.out.println(list.get(2));
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(88);
        list1.add(85);
        list1.add(92);
        list1.addAll(list);
        System.out.println(list1);


    }
}

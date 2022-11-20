package com.lesson.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
     Collection co = new ArrayList();
     co.add(8);
     co.add("jkl");
     co.add('j');
     co.add(5.6);
    // co.add(new int[]{7,9,9});

        //System.out.println(co);

        //使用迭代器遍历
        Iterator it = co.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("================");

        //使用增强for循环
        for (Object o : co) {
            System.out.println(o);
        }

        System.out.println("================");

        //使用普通for循环
        Object[] objects = co.toArray();
        for (int i = 0;i<objects.length;i++){
            System.out.println(objects[i]);
        }



}
}

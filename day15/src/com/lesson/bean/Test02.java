package com.lesson.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Test02 {
    public static void main(String[] args) {
        //定义一个Collection,添加6个整数,要删除集合元素中的偶数
        // - 删除元素
        //    boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        //    boolean removeIf(Object o)：根据条件进行移除
        //    void   clear()：清空集合中的元素
        Collection c = new ArrayList();
        c.add(9);
        c.add(2);
        c.add(4);
        c.add(6);
        c.add(8);


        Iterator it = c.iterator();
        while (it.hasNext()){
            Integer i = (Integer)it.next();
            if (i%2==0){
                it.remove();
            }
        }
        System.out.println(c);




    }
}

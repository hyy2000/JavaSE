package com.lesson.review;

import com.lesson.bean.Student;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Test01 {
    public static void main(String[] args) {
        /*
            - 添加元素add(E obj)：添加元素对象到当前集合中

    - 删除元素boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
    boolean removeIf(Object o)：根据条件进行移除
    void   clear()：清空集合中的元素

    - 查询与获取元素
    boolean isEmpty()：判断当前集合是否为空集合。
    boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素。
    int size()：获取当前集合中实际存储的元素个数
    Object[] toArray()：返回包含当前集合中所有元素的数组

    - 带All的方法后面讲
    addAll(Collection<? extends E> other)：添加other集合中的所有元素对象到当前集合中
    boolean removeAll(Collection<?> coll)：从当前集合中删除所有与coll集合中相同的元素。
    boolean containsAll(Collection<?> c)：判断c集合中的元素是否在当前集合中都存在。*/

        Collection collection = new ArrayList();
        collection.add("jkl");
        collection.add(999);
        collection.add('j');
        collection.add(new Student("张三",19));
        collection.add(987);

//        使用迭代器遍历集合
        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("===================");
//        获取当前集合中实际存储的元素个数
        System.out.println(collection.size());
//        boolean isEmpty()：判断当前集合是否为空集合。
        System.out.println(collection.isEmpty());

        System.out.println("===================");
//        collection.clear();
//        for (Object o : collection) {
//            System.out.println(o);
//        }
//        System.out.println("===================");

        collection.remove(987);
 //      collection.remove("jkl");
//        collection.remove("jjj");





        for (Object o : collection) {
            System.out.println(o);
        }

    }
}

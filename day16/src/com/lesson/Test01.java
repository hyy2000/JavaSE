package com.lesson;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
    /*  void add(int index,E   element)
        E remove(int   index)
        E set(int index,E   element)
        E get(int   index)
    * */
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("aa");
        list.add("bb");

        list.remove(0);//[bb, cc, aa, bb]
        list.remove("bb");//[cc, aa, bb]

        list.set(0,"00");//[00, aa, bb]

        list.add(0,"zz");//[zz, 00, aa, bb]

        System.out.println(list.get(3));


        System.out.println(list);


    }

}

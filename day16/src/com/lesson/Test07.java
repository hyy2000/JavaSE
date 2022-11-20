package com.lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("bb")){it.remove();}


        }
        System.out.println(list);
    }
}

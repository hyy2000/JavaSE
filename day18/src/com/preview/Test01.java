package com.preview;

import java.util.Comparator;
import java.util.TreeSet;

/* 需求,请编写程序,将字符串"helloatguigu"进行排序,顺序为: aegghillotuu*/
public class Test01 {
    public static void main(String[] args) {
        String s = "helloatguigu";
        char[] chars = s.toCharArray();
        TreeSet<Character> ts = new TreeSet<Character>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int i = o1 - o2;
               return (i ==0? 1:i);
            }
        });
        for (char aChar : chars) {
            ts.add(aChar);
        }
        System.out.println(ts);
    }
}

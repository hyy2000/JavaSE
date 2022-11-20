package com.lesson.examp;

public class Example6_Teacher {
    public static void main(String[] args) {
        String big = "woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao";
        String small = "guigu";

        int count = 0;
        int index = 0;
        while ((index = big.indexOf(small))!=-1){
            count++;
            big = big.substring(index+small.length());

        }
        System.out.println(count);
    }

}

package com.lesson.examp;

public class Example6 {
    /*需求：统计大串中小串出现的次数
    例如:
    大串为:"woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao"
    小串为:"guigu"*/

    //解题思路：
   /*   1.定义一个计数器count =0；
        2.在循环里面判断大串是否包含小串，
        3.如果包含，则计数器count++
        4.使用indexof()来获得小串在大串的首位置的索引，并使用变量i来接收
        5.i+小串.length()则是新大串的首索
        6.使用substring(i+小串.length)来获取新大串
        7.大串里面不包含小串的时候break;结束循环
        8.输出count


*/
    public static void main(String[] args) {

        String big = "woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao";
        String small = "guigu";

        int count = 0;
        //if (big.contains(small))
        while (true){
            if (big.contains(small)){
                count++;

                int i = big.indexOf(small);
                big = big.substring(i+small.length());

            }else {break;}


        }
        System.out.println(count);


        }


    }

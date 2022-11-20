package com.lesson.review2;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);}*/


        System.out.println("请输入第一个字符串:");
        String line1 = sc.nextLine();
        System.out.println("请输入第二个字符串:");
        String line2 = sc.nextLine();
        System.out.println("line1 = "+line1+", line2 = "+line2);

        /* nextInt()是键盘录入整数的方法,当我们录入10的时候
         其实在键盘上录入的是10和\r\n,nextInt()方法只获取10就结束了
         nextLine()是键盘录入字符串的方法,可以接收任意类型,但是他凭什么能获取一行呢?
         通过\r\n,只要遇到\r\n就证明一行结束,nextLine()遇到\r\n就结束了*/
        //解决上面的问题,方案1:再创建一个Scanner,但是浪费空间
        //方案2:因为键盘录入的都是字符串,所以都用nextLine()方法,然后再进行转换(推荐)



    }
}

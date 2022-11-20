package com.exam;

public class Question16 {
    public static void main(String[] args) {
        int x = 1,y =1;
        if(x++==2&&++y==2){
            x = 7;
        }
        System.out.println("x="+x+"y= "+y);




        int n = 1;
        System.out.println(n++);
        System.out.println(n);
        System.out.println("=========");
        int m = 1;
        System.out.println(++m);
        System.out.println(m);


    }
}

package com.exam;

public class Question40 {
    public static void main(String[] args){
        boolean b = true;
        if (b=false){
            //注意是b=false而不是b==false
            System.out.println("a");
        } else if (b) {
            System.out.println("b");

        } else if (!b){
            System.out.println("c");
        } else {
            System.out.println("d");
        }
        }
    }


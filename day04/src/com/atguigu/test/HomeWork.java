package com.atguigu.test;
/*
1
12
123
1234
12345

或


1
22
333
4444
55555

或


    1
   222
  33333
 4444444
555555555
 */
public class HomeWork {
    public static void main(String[] args) {

        aPrint();
        System.out.println("----------");
        aPrint1();
        System.out.println("----------");
        aPrint2();
        System.out.println("----------");

    }


    public static void aPrint(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void aPrint1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }

    public static void aPrint2(){
        for (int i = 1; i <= 5 ; i++) {//5行
            for(int j=4; j>=i; j--){//空格个数
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }



}

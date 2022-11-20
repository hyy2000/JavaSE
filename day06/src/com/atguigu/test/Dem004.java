package com.atguigu.test;

public class Dem004 {
    public static void main(String[] args) {
        int[][] arrT = new int[3][2];
        int[][] arrT1 = {{2,3,4},{1,3,5},{1,2,3,4},{3,7,9,9},{1,2}};

        System.out.println(arrT);//二维数组arrT的地址
        System.out.println(arrT[0]);//一维数组arrT[0]的地址
        System.out.println(arrT[2][1]);
        arrT[2][1] = 9;
        System.out.println(arrT[2][1]);
        System.out.println("==============================");

        for (int i= 0;i<arrT1.length;i++){
            for (int j = 0;j<arrT1[i].length;j++){
                System.out.print(arrT1[i][j]+ ", ");
            }
            System.out.println();
        }

    }
}

package com.lesson;

import java.io.File;
import java.io.IOException;

public class IoTest5 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\code\\aaa");
        file.mkdirs();

        File file1 = new File(file, "aa.txt");
        File file2 = new File(file, "bb.txt");
        File file3 = new File(file, "cc.txt");
        File file4 = new File(file, "dd.txt");
        File file5 = new File(file, "ee.txt");
        File file6 = new File(file, "ff.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        file4.createNewFile();
        file5.createNewFile();
        file6.createNewFile();
        File file7 = new File("C:\\code\\aaa");


        String[] list = file7.list();
        for (String s : list) {
            System.out.println(s);

        }


    }
}

package com.lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStremTest {
    public static void main(String[] args) throws IOException {
       /* File file = new File("1.txt");
        boolean newFile = file.createNewFile();*/

        FileOutputStream fos = new FileOutputStream("1.txt",true);

       // fos.write(99);
        fos.write("2022年11月21日下午16.56，".getBytes());





      /*  FileInputStream fis = new FileInputStream("1.txt");

        System.out.println(fis.read());*/


    }
}

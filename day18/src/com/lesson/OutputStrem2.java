package com.lesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStrem2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\code\\aaa\\aa.txt");
        //fos.write(97);
        /*byte[] b = {'c','f','d',9,93,98};
        fos.write(b);*/

        fos.write("第一次写的内容,".getBytes());

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\code\\aaa\\aa.txt", true);
        fileOutputStream.write("追加的内容,".getBytes());



        fos.close();
    }
}

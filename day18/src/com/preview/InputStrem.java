package com.preview;

import java.io.*;

public class InputStrem {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\code\\aaa\\bb.txt");
        fos.write("abcde".getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream("C:\\code\\aaa\\bb.txt");
       /* int read = fis.read();
        System.out.println(read);
        int read1 = fis.read();
        System.out.println(read1);*/

        while (true){

            int read = fis.read();
            if (read == -1){break;}
            System.out.println((char) read);
        }

        fis.close();
    }
}

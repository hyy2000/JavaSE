package com.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\code\\aaa\\青花瓷.wav");
        FileOutputStream fos = new FileOutputStream("C:\\code\\aaa\\青花瓷fuben.wav");

        int len;
        byte[] b = new byte[1024*8];
        while ((len =fis.read(b))!=-1){
            fos.write(b,0,len);

        }
        fis.close();
        fos.close();
    }
}

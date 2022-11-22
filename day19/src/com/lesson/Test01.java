package com.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*完成一个文件的拷贝，新文件的命名为源文件名-副本*/
public class Test01 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\code\\aaa\\水墨泛舟.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\code\\aaa\\水墨泛舟副本.jpg");

        while (fis.read()!=-1){

            fos.write(fis.read());
        }

        fis.close();
        fos.close();
    }
}

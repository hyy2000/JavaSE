package com.lesson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*使用字符流，完成一个文件的拷贝（分别拷贝一个纯文本和一个图片）*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\code\\aaa\\aa副本.txt");
        FileReader fr = new FileReader("C:\\code\\aaa\\aa.txt");

        int len;
        while ((len = fr.read())!=-1){
            fw.write(len);
        }
        fr.close();
        fw.close();


        FileReader fr1 = new FileReader("C:\\code\\aaa\\水墨泛舟.jpg");
        FileWriter fw1 = new FileWriter("C:\\code\\aaa\\水墨泛舟副本副本.jpg");
        int len1;
        while ((len1 = fr1.read())!=-1){
            fw1.write(len);
        }

        fr1.close();
        fw1.close();

    }
}

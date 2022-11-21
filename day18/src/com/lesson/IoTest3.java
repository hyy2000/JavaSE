package com.lesson;

import java.io.File;
import java.io.IOException;

/*File(String pathname)：根据一个路径得到File对象
- File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
- File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象(将一个父级路径封装成File类，可以方便的使用File里的功能和方法)

例全路径: D:\\aaa\\ddd.txt
父级路径D:\\aaa   子级路径ddd.txt*/
public class IoTest3 {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\code\\IoTest\\aaa\\bbbb\\ddd\\eee");
//        File file = new File("C:\\code\\IoTest");
//        boolean newFile = file.createNewFile();
//        System.out.println(newFile);

//        boolean mkdir = file.mkdir();
//        System.out.println(mkdir);
      /*  boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);*/

        File file2 = new File("C:\\code\\Test");
        File file1 = new File("C:\\code\\Test1.txt");
        File file = new File("C:\\code\\", "a.txt");
        File file3 = new File("C:\\code");
        File file4 = new File(file3, "abc.txt");

        System.out.println(file.createNewFile());

        System.out.println(file4.createNewFile());

        System.out.println(file1.createNewFile());

        System.out.println(file2.mkdirs());

        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());

        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());

        file2.delete();
        file3.delete();
        file1.delete();
        file4.delete();
        file.delete();




    }

}

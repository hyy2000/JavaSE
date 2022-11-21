package com.lesson;



import java.io.File;
import java.io.IOException;

/* public String getAbsolutePath()：获取绝对路径
- public String getPath():获取路径（获取构造方法中传入路径）
- public String getName():获取名称（获取当前文件或者文件夹的名称）
- public long length():获取长度。字节数
- public long lastModified():获取最后一次的修改时间，毫秒值
- public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
- public File[] listFiles():获取指定目录下的所有文件或者文件夹的File对象数组*/
public class IoTest4 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\code\\a.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        File file1 = new File("aa.txt");
        file1.createNewFile();
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());




    }
}

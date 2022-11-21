package com.lesson;

import java.io.File;
import java.io.IOException;

public class IoTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\code\\", "aaa.txt");
        boolean newFile = file.createNewFile();

        File file1 = new File("C:\\code\\abc.txt");
        file1.createNewFile();
        file1.renameTo(new File("C:\\code\\ccc.txt"));

        file.renameTo(new File("C:\\code\\ddd.txt"));


    }}

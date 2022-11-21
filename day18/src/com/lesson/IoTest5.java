package com.lesson;

import java.io.File;
import java.io.IOException;

public class IoTest5 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\code\\aaa");
        file.mkdirs();

        File file1 = new File(file, "aa.txt");
        file1.createNewFile();

    }
}

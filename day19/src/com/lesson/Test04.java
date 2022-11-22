package com.lesson;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test04 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\code\\aaa\\aa.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
    }
}

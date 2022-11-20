package com.lesson.bean;

public class TestReg1 {
    public static void main(String[] args) {
        String s = "atestyjuki1322456vfgd12345";

        String regx = "\\d";
        System.out.println(s.replaceAll(regx, ""));

    }
}

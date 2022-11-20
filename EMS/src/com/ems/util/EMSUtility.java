package com.ems.util;

import java.util.Scanner;

/*
 工具类   Scanner功能进行了包装
    nextInt()  nextLine()
 */
public class EMSUtility {

    private static Scanner scanner = new Scanner(System.in);

    // 获取主菜单用户输入的数据时 使用该方法
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4' && c != '5') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    // 将输入的数据,转换为char
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    // 将输入的数据,转换为char,如果输入的是回车 ,返回的就是defaultValue
    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    // 将输入的数据,转换为int
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(11, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    // 将输入的数据,转换为int 如果输入的是回车 ,返回的就是defaultValue
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(11, true);
            if (str.equals("")) {
                return defaultValue;
            }

            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    public static double readDouble() {
        double n;
        for (; ; ) {
            String str = readKeyBoard(12, false);
            try {
                n = Double.parseDouble(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    public static double readDouble(double defaultValue) {
        double n;
        for (; ; ) {
            String str = readKeyBoard(12, true);
            if (str.equals("")) {
                return defaultValue;
            }

            try {
                n = Double.parseDouble(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    // 将输入的数据,转换为String ,并且有长度限制,长度为limit
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue : str;
    }


    // 当使用确认字符时,调用该方法
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}


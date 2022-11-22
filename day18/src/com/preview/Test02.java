package com.preview;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。

张三,66,88,99
李四,66,88,99
王五,77,88,99
赵六,99,99,99
钱七,66,66,88*/
public class Test02 {
    public static void main(String[] args) {
        StudenScore s1 = new StudenScore("程蝶衣11", 60, 67, 78);
        StudenScore s2 = new StudenScore("程蝶衣22", 70, 67, 87);
        StudenScore s3 = new StudenScore("程蝶衣33", 80, 97, 60);
        StudenScore s4 = new StudenScore("程蝶衣44", 90, 87, 67);
        StudenScore s5 = new StudenScore("程蝶衣55", 66, 77, 70);

        TreeSet<StudenScore> sts = new TreeSet<>(new Comparator<StudenScore>() {
            @Override
            public int compare(StudenScore o1, StudenScore o2) {
                int i = o1.sum() - o2.sum();
                int result = i ==0? 1:i;
                return result;
            }
        });

    }
}

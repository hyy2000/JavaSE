package com.preview;

import java.util.Comparator;
import java.util.TreeSet;

/*TreeSet(Comparator comparator) ：根据指定的比较器实现compare方法进行排序*/
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Student> ts1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                int i = o1.getAge() - o2.getAge();
                int i1 = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i1;
            }
        });

        Student s1 = new Student("程蝶衣1",17);
        Student s2 = new Student("程蝶衣2",18);
        Student s3 = new Student("程蝶衣3",19);
        Student s4 = new Student("程蝶衣4",15);
        Student s5 = new Student("程蝶衣5",16);
        Student s6 = new Student("程蝶衣6",16);

        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);
        ts1.add(s6);
        System.out.println(ts1);

    }
}

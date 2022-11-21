package com.preview;

public class Student implements Comparable{
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Student s= (Student) o;
        int i = this.getAge() - ((Student) o).getAge();
        return ((i == 0) ? (this.getName().compareTo(s.getName())):i);
    }
    /*
    * // 该方法的返回值 代表的就是 排序的依据(两个对象的差值)
    //  返回值为 0  两个对象的差值为0
    // 返回值 为 < 0  -1   前 > 后   倒序
    // 返回值 为 > 0 1     前< 后  正序
    // 按照 对象的年龄  正序排序
    // 当年龄相等,再按姓名名  默认字符串排序*/
}

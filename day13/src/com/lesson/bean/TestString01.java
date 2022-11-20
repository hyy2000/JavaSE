package com.lesson.bean;

public class TestString01 {
    public static void main(String[] args) {
        /*字符串是常量，它的值在创建之后不可改变（引用关系可以改变）
       特点：
        * 字符串类型本身是final，意味着不能继承String
        * 字符串的对象也是不可变对象，一旦修改就会产生新的对象
        * String对象内部是用字符数组进行保存的："abc"等效于 cha[] data = {'a','b','c'}
        * String类中这个char[] values数组也是final修饰的，意味着这个数组不可变，然后它是private修饰，外部不能直接操作它，
        String类型提供的所有的方法都是用新对象来表示修改后内容的，所以保证了String对象的不可变。
        * 就因为字符串对象设计为不可变，那么所以字符串有常量池来保存很多常量对象

常量池在方法区。*/

        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcd");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}


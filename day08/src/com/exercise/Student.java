package com.exercise;

    public class Student {
        private String name;
        private int age;

        public Student() {
            System.out.println("无参构造");
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("有参构造");
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

        public String getInfo(){
            return "姓名：" + name +"，年龄：" + age;
        }
    }

    class TestStudent{
        public static void main(String[] args) {
            Student stu = new Student("zhangsan",19);
        }

    }


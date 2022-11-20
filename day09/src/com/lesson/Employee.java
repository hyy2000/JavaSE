package com.lesson;

public class Employee {
    private String name;
    private static int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


class TestEmp{
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setName("张三");
        e1.setId(10010);
        System.out.println(e1.toString());
        e2.setName("李四");
        e2.setId(10086);
        System.out.println(e2.toString());
        System.out.println(e1.toString());
    }

}
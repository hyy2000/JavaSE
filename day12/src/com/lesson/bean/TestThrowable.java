package com.lesson.bean;

public class TestThrowable {
    public static void main(String[] args) throws Exception {

        Person person = new Person();
        person.setAge(200);
        System.out.println(person.getAge());

       // Person person1 = new Person("lisi",200);

    }

}

class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) throws Exception {
        if (age>=0&&age<=120){
        this.name = name;
        this.age = age;
        }else {
            throw new Exception("非法数据");
        }

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

    public void setAge(int age) throws Exception{
        if (age>=0&&age<=120){
        this.age = age;
        }else throw new Exception("非法数据");
    }
}

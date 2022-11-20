package com.lesson.review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Test02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Person("涨三",19,"男"));
        collection.add(new Person("李四",29,"女"));
        collection.add(new Person("王五",18,"女"));
        collection.add(new Person("程蝶衣",18,"女"));
        collection.add(new Person("刻晴",22,"女"));
        collection.add(new Person("可莉",25,"女"));

        collection.removeIf(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {

                return person.getAge()>=20;
            }
        });

        System.out.println(collection);

        //使用迭代器删除
      /*  Iterator it = collection.iterator();
        while (it.hasNext()) {
            Person p = (Person) it.next();
            if (p.getAge()>= 20){
                it.remove();
            }
        }
*/
        System.out.println(collection);


    }

}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
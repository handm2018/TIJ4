package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 演示set集合使用
 *@author: 韩东明
 *@date: 2020/05/06 10:22
 */
public class Student2 {
    private String name;
    private Integer age;

    public Student2() {
    }

    public Student2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

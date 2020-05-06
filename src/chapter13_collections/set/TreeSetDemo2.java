package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description:
 *@author: 韩东明
 *@date: 2020/05/06 16:07
 */
public class TreeSetDemo2 {

    public static void main(String[] args) {
        TreeSet<Student> s1 = new TreeSet<>();
        Student student1 = new Student("wzx",23);
        Student student2 = new Student("gyy",22);
        Student student3 = new Student("zmy",27);
        s1.add(student1);
        s1.add(student2);
        s1.add(student3);
        for (Student s : s1) {
            System.out.println(s);
        }
    }
}

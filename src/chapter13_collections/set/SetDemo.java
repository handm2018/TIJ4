package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: set简单使用
 *@author: 韩东明
 *@date: 2020/05/06 09:49
 */
public class SetDemo {

    public static void main(String[] args) {
        /**
         * set:
         *      元素唯一
         *      没有带索引的方法，无法使用普通for循环进行遍历
         */

        // 创建集合
        Set<Student> studentSet1 = new HashSet<>();
        // 添加元素
        Student student1 = new Student("王祖贤", 23);
        Student student2 = new Student("林青霞", 24);
        studentSet1.add(student1);
        studentSet1.add(student2);
        studentSet1.add(student1);
        // 遍历
        for (Student s1 : studentSet1){
            System.out.println(s1);
        }

        System.out.println("----------------------");
        Iterator<Student> iterator = studentSet1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

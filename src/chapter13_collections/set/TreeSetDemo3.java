package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 比较器comparator的使用
 *@author: 韩东明
 *@date: 2020/05/07 16:19
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {

        // 有参构造 , 匿名内部类创建比较器
        TreeSet<Student2> student2TreeSet = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.getAge() - s2.getAge() == 0 ? s1.getName().compareTo(s2.getName()) : s1.getAge() - s2.getAge();
            }
        });

        Student2 dlrb = new Student2("dlrb", 26);
        Student2 glnz = new Student2("glnz", 27);
        Student2 lyf = new Student2("lyf", 26);
        Student2 lss = new Student2("lss", 23);
        Student2 lss2 = new Student2("lss", 23);
        student2TreeSet.add(dlrb);
        student2TreeSet.add(glnz);
        student2TreeSet.add(lyf);
        student2TreeSet.add(lss);
        student2TreeSet.add(lss2);

        for (Student2 student2 : student2TreeSet) {
            System.out.println(student2);
        }

    }
}

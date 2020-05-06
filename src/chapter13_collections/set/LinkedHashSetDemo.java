package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: LinkedHashSet简单使用
 *@author: 韩东明
 *@date: 2020/05/06 13:38
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        /**
         * LinkedHashSet:
         *      元素唯一,有序
         *      hash表和双重链表的底层数组结构
         *      hash表结构保证元素唯一性
         *      链表保证元素的顺序
         */

        LinkedHashSet<String> s1 = new LinkedHashSet<>();
        s1.add("hello");
        s1.add("java");
        s1.add("world");
        s1.add("java");

        for (String s : s1){
            System.out.println(s);
        }
    }
}

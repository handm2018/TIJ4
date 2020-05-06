package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: HashSet简单使用
 *@author: 韩东明
 *@date: 2020/05/06 11:05
 */
public class HashSetDemo {

    public static void main(String[] args) {
        /**
         * hashSet:
         *      实现 Set 接口，允许null，元素唯一，不保证顺序
         */

        HashSet<String> s1 = new HashSet<>();

        s1.add("hello");
        s1.add("java");
        s1.add("world");
        s1.add("world");

        for (String s : s1) {
            System.out.println(s);
        }
    }

}

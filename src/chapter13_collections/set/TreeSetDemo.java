package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: TreeSet的简单使用
 *@author: 韩东明
 *@date: 2020/05/06 14:08
 */
public class TreeSetDemo {


    public static void main(String[] args) {

        /**
         * 使用元素的自然顺序对元素进行排序，或者根据创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法。
         *      TreeSet()
         *           构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
         *      TreeSet(Comparator<? super E> comparator)
         *           构造一个新的空 TreeSet，它根据指定比较器进行排序。
         *
         *  set集合,元素唯一
         *
         */

        // 空参构造方法创建,元素使用自然排序
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("java");
        treeSet1.add("hello");
        treeSet1.add("abc");
        treeSet1.add("we");
        treeSet1.add("we");

        for (String s : treeSet1) {
            System.out.println(s);
        }

        //
    }
}

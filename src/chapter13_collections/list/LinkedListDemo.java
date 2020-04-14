package chapter13_collections.list;

import java.util.LinkedList;

/**
 * @author : handongming
 * @date : Created in 2020-04-14 22:01
 * @desc : LinkedList简单示例
 *          底层数据结构是链表，有序，允许null，增删快，
 *          随机访问慢，原因是无论访问哪些元素，都是从链表头部开始的
 *          由于其数据结构的特殊性，有相应的特有方法，如：从头部或尾部操作元素
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        /**
         * 继承自List，方法和用法与List基本一致
         * 主要注意的是其数据结构的特殊性
         */
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        System.out.println("-------------");
        strings.addFirst("Hi");
        strings.addLast("json");
        strings.add(2,"javase");
        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}

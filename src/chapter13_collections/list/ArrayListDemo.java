package chapter13_collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author : handongming
 * @date : Created in 2020-04-14 21:43
 * @desc : arraylist示例
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建
        List<String> stringList = new ArrayList<>();
        //添加元素
        stringList.add("hello");
        stringList.add("world");
        stringList.add("java");
        stringList.add(1,"javaee");
        //遍历
        for (String str : stringList) {
            System.out.println(str);
        }
        System.out.println("-----------------------");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            /**
             * 以下操作导致并发修改异常。ConcurrentModificationException
             */
//            if ("java".equals(next)) {
//                stringList.add("spring");
//            }

            System.out.println(next);
        }
        System.out.println("-----------");
        /**
         * ArrayList的特有迭代器，不同点
         * ListIterator的用法：
         *      包含向前遍历的方法和向后遍历的方法  hasPrevious()和previous()
         *      且可以在迭代元素的时候，操作集合，往集合中添加、修改或删除元素 remove()、set(E e)和add(E e)
         *
         */

        ListIterator<String> listIterator = stringList.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if ("java".equals(next)) {
                listIterator.set("spring");
                listIterator.add("json");
            }
        }
        System.out.println(stringList);


    }
}

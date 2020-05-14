package chapter13_collections.iterator;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 尝试将数组作为一个 **Iterable** 参数传递会导致失败。这说明不存在任何从数组到 **Iterable** 的自动转换; 必须手工执行这种转换。
 *@author: 韩东明
 *@date: 2020/05/13 15:05
 */
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> it) {
        for (T t : it) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3, 4, 5));
        String[] strings = {"A", "B", "C"};
        // An array works in for-in, but it's not Iterable:
        //- test(strings);
        // You must explicitly convert it to an Iterable:
        System.out.println("-------------");
        test(Arrays.asList(strings));
    }

}

package chapter13_collections.iterator;

import java.util.*;

/**
 *@program: TIJ4
 *@description: `System.getenv()` [^7]返回一个 **Map** ， `entrySet()` 产生一个由 **Map.Entry** 的元素构成的 **Set** ，并且这个 **Set** 是一个 **Iterable** ，因此它可以用于 *for-in* 循环。
 *@author: 韩东明
 *@date: 2020/05/13 14:56
 */
public class EnvironmentVariables {

    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}

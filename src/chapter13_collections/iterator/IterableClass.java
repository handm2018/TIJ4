package chapter13_collections.iterator;

import java.util.*;

/**
 *@program: TIJ4
 *@description:  **Iterable** 的接口，该接口包含一个能够生成 **Iterator** 的 `iterator()` 方法。*for-in* 使用此 **Iterable** 接口来遍历序列
 *              `iterator()` 返回的是实现了 **Iterator\<String>** 的匿名内部类的实例，该匿名内部类可以遍历数组中的每个单词。
 *              在main()方法中，可以看到 **IterableClass** 确实可以用于 *for-in* 语句
 *@author: 韩东明
 *@date: 2020/05/13 14:46
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s);
        }
    }
}

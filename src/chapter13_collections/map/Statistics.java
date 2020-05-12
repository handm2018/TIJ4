package chapter13_collections.map;

import java.util.*;

/**
 *@program: TIJ4
 *@description: map的简单示例，将一个对象映射到另一个对象的能力是解决编程问题的一个有效方法
 *@author: 韩东明
 *@date: 2020/05/12 11:27
 */
public class Statistics {
    public static void main(String[] args) {
        /**
         * 验证Random()方法 得到的是随机的值
         *      将得到的随机数作为key，出现的次数作为value，存入到map中去
         */
        Random random = new Random();

        Map<Integer, Integer> ints = new HashMap(32);
        for (int i = 1; i < 10000; i++) {
            int i1 = random.nextInt(31);
            ints.put(i1, ints.get(i1) == null ? 1 : ints.get(i1) + 1);
        }
        System.out.println(ints);


    }
}

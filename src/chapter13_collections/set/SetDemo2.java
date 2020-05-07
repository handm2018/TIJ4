package chapter13_collections.set;

import java.util.*;

/**
 *@program: TIJ4
 *@description: set集合练习
 *@author: 韩东明
 *@date: 2020/05/07 16:38
 */
public class SetDemo2 {

    public static void main(String[] args) {
        /**
         * 获取10个1-100之间的随机数,不能重复
         */

        Set<Integer> nums = new HashSet<>(10);

        while (nums.size() != 10) {
            int i = new Random().nextInt(100) + 1;
            nums.add(i);
        }
        for (Integer num : nums) {
            System.out.println(num);
        }

    }
}

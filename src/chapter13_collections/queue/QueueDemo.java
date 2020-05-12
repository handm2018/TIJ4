package chapter13_collections.queue;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 队列是一个典型的“先进先出”的集合，
 *              **LinkedList** 实现了 **Queue** 接口，并且提供了一些方法以支持队列行为，因此 **LinkedList** 可以用作 **Queue** 的一种实现。
 *              通过将 **LinkedList** 向上转换为 **Queue** ，下面的示例使用了在 **Queue** 接口中与 **Queue** 相关(Queue-specific)的方法：
 *@author: 韩东明
 *@date: 2020/05/12 14:10
 */
public class QueueDemo {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.println(queue.remove() + " ");
        }
        System.out.println(".................");
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i< 15; i++){
//            queue.add(i+1);
            queue.offer(i+1);
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for(char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }

}

package chapter13_collections.queue;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 优先级队列, **PriorityQueue** 是允许重复的。最小的值具有最高的优先级。 可以实现排序。
 *@author: 韩东明
 *@date: 2020/05/12 14:54
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i+10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20,
                18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings =
                Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPriorityQueue);

        stringPriorityQueue = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPriorityQueue.addAll(strings);
        QueueDemo.printQ(stringPriorityQueue);

        Set<Character> characters = new HashSet<>();
        for(char c:fact.toCharArray()){
            characters.add(c);
        }
        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(characters);
        QueueDemo.printQ(characterPriorityQueue);

    }
}

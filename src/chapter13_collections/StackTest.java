package chapter13_collections;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 堆栈
 *@author: 韩东明
 *@date: 2020/05/12 10:22
 */
public class StackTest {
    public static void main(String[] args) {

//        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();

        Deque<String> stack = new ArrayDeque<>();
        for(String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}

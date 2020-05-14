package chapter13_collections.iterator;

import java.util.*;

/**
 *@program: TIJ4
 *@description:
 *@author: 韩东明
 *@date: 2020/05/13 14:41
 */
public class ForInCollections {

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs) {
            System.out.print(s + " ");
        }
    }

}

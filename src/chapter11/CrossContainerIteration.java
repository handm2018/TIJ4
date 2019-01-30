package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName CrossContainerIteration.java
 * @Description 接收对象容器并传递它，从而在每个对象上都执行操作，这种思想十分强大
 * @createTime 2019年01月30日 09:51:00
 */
public class CrossContainerIteration {
    public static void display(Iterator<String> it){
        while (it.hasNext()){
            String str = it.next();
            System.out.print("------"+str);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));
        LinkedList linkedList = new LinkedList(arrayList);
        HashSet hashSet = new HashSet(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        display(arrayList.iterator());
        display(linkedList.iterator());
        display(hashSet.iterator());
        display(linkedHashSet.iterator());
    }
}

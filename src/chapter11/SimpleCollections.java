package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SimpleCollections {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(10);
        Collection<Integer> c2=new HashSet<>(10);
        for (int i = 0; i <10 ; i++) {
            c2.add(i);
        }

        for (Integer i: c2) {
            System.out.println("now:"+i);
        }

    }
}

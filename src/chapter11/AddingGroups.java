package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> moreInt = Arrays.asList(6, 7, 8, 9);
        collection.addAll(moreInt);

        Collections.addAll(collection, 10, 11, 12, 13, 14, 15);
        System.out.println(collection);

        List<Integer> list = Arrays.asList(16, 17, 18, 19);
        list.set(1, 99);
        System.out.println(list);

    }
}

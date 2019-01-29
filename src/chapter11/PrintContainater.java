package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintContainater {

    static Collection<String> fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map<String,String> fill(Map<String,String> map){
        map.put("rat","Rating");
        map.put("cat","Cat");
        map.put("dog","Dog");
        map.put("dog","RDog");
        return map;
    }

    static void print(Object o){
        System.out.println(o.toString());
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<>()));
        print(fill(new LinkedList<>()));
        print(fill(new HashSet<>()));
        print(fill(new LinkedHashSet<>()));
        print(fill(new TreeSet<>()));
        print(fill(new HashMap<>()));
        print(fill(new LinkedHashMap<>()));
        print(fill(new TreeMap<>()));
    }
}

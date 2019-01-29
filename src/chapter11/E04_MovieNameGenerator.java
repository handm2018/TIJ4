package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class E04_MovieNameGenerator {

    public static final MovieNameGenerator mng = new MovieNameGenerator();

    public static String[] fill(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = mng.next();
        }
        return array;
    }

    public static Collection<String> fill(Collection<String> c) {
        for (int i = 0; i < 5; i++) {
            c.add(mng.next());
        }
        return c;
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        print(Arrays.toString(fill(new String[5])));
        print(fill(new ArrayList<>()));
        print(fill(new LinkedList<>()));
        print(fill(new LinkedHashSet<>()));
        print(fill(new HashSet<>()));
        print(fill(new TreeSet<>()));
    }

}

/**
 * 创建生成器，循环到某处时，返回到容器的开始处
 */
class MovieNameGenerator {

    private String[] charactors = {"Tom", "Jerry", "Martin", "Smith", "Lucy", "Snow White",
        "Star Wars"};
    int next;

    public String next() {
        String r = charactors[next];
        next = (next + 1) % charactors.length;
        return r;
    }

}
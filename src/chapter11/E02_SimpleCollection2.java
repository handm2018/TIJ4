package chapter11;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E02_SimpleCollection2.java
 * @Description TODO
 * @createTime 2019年01月31日 10:14:00
 */
public class E02_SimpleCollection2 {

    public static void main(String[] args) {
        Collection<Integer> ints = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        for (Integer i : ints
        ) {
            System.out.println(i + ",");
        }
    }

}

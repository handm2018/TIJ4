package chapter17_string;

import java.util.ArrayList;

/**
 * 无意识的递归 toString()
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            strings.add(i + "个");
        }

        System.out.println(strings);

    }
}

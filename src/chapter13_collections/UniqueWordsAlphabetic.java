package chapter13_collections;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

/**
 *@program: TIJ4
 *@description: set的使用
 *@author: 韩东明
 *@date: 2020/05/12 10:43
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) throws IOException {
        URL resource = UniqueWordsAlphabetic.class.getResource("");
        System.out.println(resource);

        List<String> strings = Files.readAllLines(Paths.get("E:\\IdeaProjects\\TIJ4\\src\\chapter13_collections\\StackTest.java"));
//        TreeSet<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        TreeSet<String> treeSet = new TreeSet<>();
        for (String line : strings) {
            for (String word : line.split("\\W+")) {
                if (word.trim().length() > 0) {
                    treeSet.add(word);
                }
            }
        }

        System.out.println(treeSet);
    }
}

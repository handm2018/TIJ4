package chapter13_collections.map;

import typeinfo.pets.*;

import java.util.*;

/**
 *@program: TIJ4
 *@description: containsKey() 和 containsValue()
 *@author: 韩东明
 *@date: 2020/05/12 13:26
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
}

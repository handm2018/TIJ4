package chapter13_collections.map;

import typeinfo.pets.*;

import java.util.*;

/**
 *@program: TIJ4
 *@description: map扩展，值为集合时，可以很容易的组合成强大的数据结构
 *              **Map** 可以返回由其键组成的 **Set** ，由其值组成的 **Collection** ，或者其键值对的 **Set** 。
 *              `keySet()` 方法生成由在 **petPeople** 中的所有键组成的 **Set** ，它在 *for-in* 语句中被用来遍历该 **Map**
 *@author: 韩东明
 *@date: 2020/05/12 13:36
 */
public class MapOfList {

    public static final Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(
                        new Cymric("Molly"),
                        new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),
                        new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(
                        new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford"),
                        new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(
                        new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for (Person person : petPeople.keySet()) {
            System.out.println(person + "has：");
            for (Pet pet : petPeople.get(person)) {
                System.out.println(" " + pet);
            }
        }

    }
}

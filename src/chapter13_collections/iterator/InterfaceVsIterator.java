package chapter13_collections.iterator;

import typeinfo.pets.*;

import java.util.*;

/**
 *@program: TIJ4
 *@description: 接口和迭代器
 *@author: 韩东明
 *@date: 2020/05/12 15:36
 */
public class InterfaceVsIterator {

    public static void displayByIterator(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void displayByInterface(Collection<Pet> collection) {
        for (Pet p : collection) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new HashMap<>();
        String[] names = ("Ralph, Eric, Robin, Lacey, " + "Britney, Sam, Spot, Fluffy").split(", ");
        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }

        displayByInterface(petList);
        displayByInterface(petSet);

        displayByIterator(petList.iterator());
        displayByIterator(petSet.iterator());

        System.out.println(petMap);
        System.out.println(petMap.keySet());

        displayByInterface(petMap.values());
        displayByIterator(petMap.values().iterator());
    }
}

/**
 *
 * 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
 * 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
 * 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
 * 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
 * {Fluffy=Manx, Ralph=Rat, Spot=Pug, Eric=Manx, Britney=Pug, Robin=Cymric, Lacey=Mutt, Sam=Cymric}
 * [Fluffy, Ralph, Spot, Eric, Britney, Robin, Lacey, Sam]
 * 7:Manx 0:Rat 6:Pug 1:Manx 4:Pug 2:Cymric 3:Mutt 5:Cymric
 * 7:Manx 0:Rat 6:Pug 1:Manx 4:Pug 2:Cymric 3:Mutt 5:Cymric
 *
 *
 */
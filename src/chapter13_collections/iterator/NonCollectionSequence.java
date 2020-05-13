package chapter13_collections.iterator;

import typeinfo.pets.*;

import java.util.*;

/**
 *@program: TIJ4
 *@description:
 *@author: 韩东明
 *@date: 2020/05/13 14:14
 */
public class NonCollectionSequence extends PetSequence{

    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.displayByIterator(nc.iterator());
    }

}

class PetSequence{
    protected Pet[] pets = Pets.createArray(8);
}
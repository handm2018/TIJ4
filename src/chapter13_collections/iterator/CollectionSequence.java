package chapter13_collections.iterator;

import typeinfo.pets.*;

import java.util.*;

/**
 *@program: TIJ4
 *@description: collection与iterator接口的比较，实现collection接口的局限性
 *              这个例子表明，如果实现了 **Collection** ，就必须实现 `iterator()` ，并且只拿实现 `iterator()` 与继承 **AbstractCollection** 相比，花费的代价只有略微减少。
 *              但是，如果类已经继承了其他的类，那么就不能继承再 **AbstractCollection** 了。
 *              在这种情况下，要实现 **Collection** ，就必须实现该接口中的所有方法。此时，继承并提供创建迭代器的能力要容易得多
 *
 *@author: 韩东明
 *@date: 2020/05/13 13:21
 */
public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
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

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.displayByInterface(c);
        System.out.println("-------------------");
        InterfaceVsIterator.displayByIterator(c.iterator());
    }

}

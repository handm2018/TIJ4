
```java
public class HashSet<E>
    extends AbstractSet<E>
    implements Set<E>, Cloneable, java.io.Serializable {

    private transient HashMap<E,Object> map;

    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();

    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }  
}
```

```java
public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable {

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
        
    // hashMap类中的put方法
    public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }

    /**
     * Implements Map.put and related methods
     *
     * @param hash hash for key   根据hashCode()方法重新计算得到的新hash值
     * @param key the key   元素本身
     * @param value the value to put
     * @param onlyIfAbsent if true, don't change existing value
     * @param evict if false, the table is in creation mode.
     * @return previous value, or null if none
     */
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        // hash表数组结构的实现方式之一,元素为节点类的数组
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        // 如果hash表未初始化,对其进行初始化
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;

        // 根据对象的hash值计算其存储位置,如果该位置没有元素,就存储元素
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);

        else {
            Node<K,V> e; K k;
            /**
             * p.hash == hash 存入元素的hash值与该存储位置上的已有元素的hash值进行比较
             *      如果hash值不同,继续向下执行,直接在该位置上存储元素
             *      如果hash值相同,比较元素是否为同一对象,调用对象的equals()方法比较内容
             *            如果返回false,会继续向下执行,将元素添加到集合中
             *            如果返回true,不再添加元素
             */
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
}
```



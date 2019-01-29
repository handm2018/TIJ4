package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-----------------------------");

        for (String s : list
        ) {
            System.out.println(s);
        }

        //此处想要再次使用迭代器，必须重新赋值初始化。因为上面已经使用过了，迭代器中的迭代控制下标，已经达到了list容器的size了。
        it = list.iterator();
        for (int i = 0; i < 3; i++) {
            it.next();
            it.remove();
        }

        System.out.println(list);
    }
}

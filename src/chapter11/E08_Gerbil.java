package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E08_Gerbil.java
 * @Description 修改联系1，调用hop方法时去遍历list
 * @createTime 2019年01月30日 10:23:00
 */
public class E08_Gerbil {

    public static void main(String[] args) {
        List<Gerbil2> gerbil2s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbil2s.add(new Gerbil2(i));
        }
        for (Gerbil2 ger : gerbil2s
        ) {
            ger.hop(gerbil2s.iterator());
            System.out.println();
        }
    }
}

class Gerbil2 {

    private int gerbilNumber;

    Gerbil2(int number) {
        this.gerbilNumber = number;
    }

    @Override
    public String toString() {
        return "gerbilNumber" + gerbilNumber;
    }

    public void hop(Iterator<Gerbil2> iterator) {
        while (iterator.hasNext()) {
            Gerbil2 gerbil = iterator.next();
            System.out.print("gerbil = [" + gerbil + "]");
        }
    }
}

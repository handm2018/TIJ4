package chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E03_UnlimitedSequence.java
 * @Description TODO
 * @createTime 2019年01月31日 10:19:00
 */
public class E03_UnlimitedSequence {

    public static void main(String[] args) {
        UnlimitedSequence unlimitedSequence = new UnlimitedSequence();

        for (int i = 0; i < 12; i++) {
            unlimitedSequence.add(i);
        }

        Selector selector = unlimitedSequence.sequenceSelector();
        while (!selector.end()) {
            selector.current();
            System.out.println(selector.current());
            selector.next();
        }
    }
}

class UnlimitedSequence {

    private final List<Object> items = new ArrayList<>();

    public void add(Object o) {
        items.add(o);
    }

    private class SequenceSelector implements Selector {

        private int i;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size()) {
                i++;
            }
        }
    }

    public SequenceSelector sequenceSelector() {
        return new SequenceSelector();
    }
}

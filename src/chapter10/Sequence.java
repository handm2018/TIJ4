package chapter10;

/**
 * ClassName: Sequence .<br/>
 * Function: 内部类的创建及链接外部类使用，此处使用了迭代器模式. <br/>
 * date: 2019年1月11日 下午3:33:17 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Sequence {

    /**
     * 容器
     */
    private Object[] items;
    /**
     * 当前下标
     */
    private int next = 0;

    /**
     * 初始化一个带有初始容量的数组容器 Creates a new instance of Sequence.
     * 
     * @param size
     */
    public Sequence(int size) {
        items = new Object[size];
    }

    /**
     * add:向容器添加对象. <br/>
     * 只要当前数组下标小于容器容量，就允许添加
     * 
     * @author handm2018@126.com
     * @param x
     */
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        } else {
            items = new Object[2*items.length];
        }
    }

    /**
     * ClassName: SequenceSelector <br/>
     * Function: 内部类，迭代器，可以判断是否末尾序列，获取当前序列对象，遍历序列 <br/>
     * 说明：内部类可以直接访问外部类的属性资源 date: 2019年1月11日 下午4:25:10 <br/>
     * 
     * @author handm2018@126.com
     */
    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object cuurent() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    /**
     * 
     * selector:向外的出口，即获取当前容器的迭代器. <br/>
     * 
     * @author handm2018@126.com
     * @return
     */
    public SequenceSelector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {

        // 创建容器
        Sequence sequence = new Sequence(10);

        // 向容器种添加对象
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        // 获取容器迭代器
        Selector selector = sequence.selector();

        // 使用迭代器遍历元素
        while (!selector.end()) {
            System.out.println("current :" + selector.cuurent());
            selector.next();
        }

        Sequence hasStrs = new Sequence(15);

        for (int i = 0; i < 15; i++) {
            hasStrs.add(new HasString("元素" + (i+1)));
        }

        Selector selector2 = hasStrs.selector();

        while (!selector2.end()) {
            System.out.println(selector2.cuurent());
            selector2.next();
        }

    }

}


class HasString {
    private String value;

    public HasString(String value) {
        this.value = value;
    }

    /**
     * 说明：将此对象的属性值输出（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "HasString:" + value;
    }
}

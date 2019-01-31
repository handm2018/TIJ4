package chapter11;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName Selector.java
 * @Description sequence中的迭代器使用
 * @createTime 2019年01月31日 10:23:00
 */
public interface Selector {

    boolean end();

    Object current();

    void next();

}

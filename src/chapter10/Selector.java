package chapter10;

/**
 * ClassName: Select <br/>
 * Function: 接口规约，使用于squence类中的内部类（sequence的迭代器），. <br/>
 * date: 2019年1月11日 下午3:30:07 <br/>
 * @author handm2018@126.com
 * @version
 */
public interface Selector {
    boolean end();

    Object cuurent();

    void next();
}

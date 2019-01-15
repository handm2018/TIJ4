package chapter10;

/**
 * ClassName: Wraping <br/>
 * Function: 基类，用作带参数的匿名内部类的基类使用. <br/>
 * date: 2019年1月15日 上午11:56:43 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Wraping {
    private String name;

    public Wraping(String name) {
        super();
        this.name = name;
    }

    public void f() {
        System.out.println(name);
    }
}

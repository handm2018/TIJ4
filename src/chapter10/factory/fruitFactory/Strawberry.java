package chapter10.factory.fruitFactory;

/**
 * ClassName: Strawberry <br/>
 * Function: 具体水果类--草莓. <br/>
 * date: 2019年1月16日 下午6:07:53 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Strawberry implements Fruit {

    /**
     * Function（可选）.
     */
    @Override
    public void plant() {
        log("Strawberry has been planted!");
    }

    /**
     * Function 简单描述该方法的实现功能（可选）.
     */
    @Override
    public void grow() {
        log("Strawberry is growing!");
    }

    /**
     * Function 简单描述该方法的实现功能（可选）.
     */
    @Override
    public void harvest() {
        log("Strawberry has been harvested!");
    }

    public void log(String msg) {
        System.out.println(msg);
    }

}

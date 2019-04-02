package chapter10.factory.fruitFactory;

/**
 * ClassName: Grape <br/>
 * Function: 具体水果类--葡萄. <br/>
 * date: 2019年1月16日 下午6:06:29 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Grape implements Fruit {

    private boolean seedless;

    /**
     * Function .
     */
    @Override
    public void plant() {
        log("Grape has been planted!");

    }

    /**
     * Function（可选）.
     */
    @Override
    public void grow() {
        log("Grape is growing!");

    }

    /**
     * Function 简单描述该方法的实现功能（可选）.
     */
    @Override
    public void harvest() {
        log("Grape has been harvested!");

    }

    private void log(String msg) {
        System.out.println(msg);
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }


}

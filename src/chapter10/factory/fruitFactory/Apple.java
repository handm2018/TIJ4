package chapter10.factory.fruitFactory;

/**
 * ClassName: Apple <br/>
 * Function: 具体水果类--苹果. <br/>
 * date: 2019年1月16日 下午6:02:24 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Apple implements Fruit {

    private int age;

    /**
     * 种植.
     * 
     * @see chapter10.factory.fruitFactory.Fruit#plant()
     */
    @Override
    public void plant() {
        System.out.println("apple has been planted");
    }

    /**
     * 生长.
     * 
     * @see chapter10.factory.fruitFactory.Fruit#grow()
     */
    @Override
    public void grow() {
        System.out.println("apple is growing");

    }

    /**
     * 收获.
     * 
     * @see chapter10.factory.fruitFactory.Fruit#harvest()
     */
    @Override
    public void harvest() {
        System.out.println("apple harvest");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

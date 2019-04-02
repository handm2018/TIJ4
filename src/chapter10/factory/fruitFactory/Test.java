package chapter10.factory.fruitFactory;

/**
 * ClassName: Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月17日 下午6:30:14 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Test {
    public static void main(String[] args) {
        try {
            FruitGardener.factory("apple");
            FruitGardener.factory("grape");
            FruitGardener.factory("strawberry");
        } catch (BadException e) {
            e.printStackTrace();
        }
    }
}

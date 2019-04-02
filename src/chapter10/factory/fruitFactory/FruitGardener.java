package chapter10.factory.fruitFactory;

/**
 * ClassName: FruitGardener <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月17日 下午6:18:04 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class FruitGardener {

    public static Fruit factory(String type) throws BadException {
        if ("apple".equalsIgnoreCase(type)) {
            return new Apple();
        } else if ("grape".equalsIgnoreCase(type)) {
            return new Grape();
        } else if ("strawberry".equalsIgnoreCase(type)) {
            return new Strawberry();
        } else {
            throw new BadException("");
        }
    }


}

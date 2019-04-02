package chapter10;

/**
 * ClassName: Parcel10 <br/>
 * Function: 对于匿名内部类，实例化的实际效果就是构造器. <br/>
 * date: 2019年1月15日 下午3:33:42 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel10 {
    public Destination destination(String dest, double price) {
        return new Destination() {

            private int cost;

            {
                cost = (int) Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget");
                }
            }

            private String lable = dest;

            @Override
            public String readLable() {
                return lable;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination destination = parcel10.destination("beijing", 108.23d);
        System.out.println(destination.readLable());
    }
}

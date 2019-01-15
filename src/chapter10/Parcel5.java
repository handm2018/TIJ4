package chapter10;

/**
 * ClassName: Parcel5 <br/>
 * Function: 局部内部类：在方法作用域内创建一个完整的类，这个类就叫做局部内部类. <br/>
 * date: 2019年1月14日 下午4:15:48 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String lable;

            private PDestination(String whereTo) {
                lable = whereTo;
            }

            public String readLable() {
                return lable;
            }
        }
        // 此处返回以后进行了向上转型
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        p.destination("shanghai");
    }
}

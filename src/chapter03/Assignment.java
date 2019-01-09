package chapter03;

/**
 * ClassName:Assignment <br/>
 * Function: ADD FUNCTION java操作符，对象赋值需要注意的地方. <br/>
 * Reason: ADD REASON 别名问题. <br/>
 * Date: 2018年12月5日 上午9:59:20 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */

class Tank {
    int level;
}

class TankFloat {
    float money;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 17;
        t2.level = 23;
        System.out.println("before : t1.level = " + t1.level);
        System.out.println("before : t2.level = " + t2.level);
        Tank t3 = t1;
        t3.level = 99;
        System.out.println("after : t1.level = " + t1.level);

        /**
         * 直接给对象赋值，很容易出现别名问题。如果需要，直接赋值给对象的属性，而不能直接赋值给对象 例如：tf2.money = tf1.money可有效避免别名
         */
        TankFloat tf1 = new TankFloat();
        TankFloat tf2 = new TankFloat();
        tf1.money = 23.0f;
        tf2.money = 47.0f;
        System.out.println("before : tf1.money = " + tf1.money);
        System.out.println("before : tf2.money = " + tf2.money);
        tf2 = tf1;
        tf1.money = 100f;
        System.out.println("after : tf1.money = " + tf1.money);
        System.out.println("after : tf2.money = " + tf2.money);



    }

}


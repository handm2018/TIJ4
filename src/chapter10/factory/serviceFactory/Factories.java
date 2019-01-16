package chapter10.factory.serviceFactory;

/**
 * ClassName: Factories <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月15日 下午4:53:35 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

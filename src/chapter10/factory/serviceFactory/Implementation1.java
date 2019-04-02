package chapter10.factory.serviceFactory;

/**
 * ClassName: Implementaion1 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月15日 下午4:27:40 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Implementation1 implements Service {

    private Implementation1() {}

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
    
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };

}

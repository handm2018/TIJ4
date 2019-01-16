package chapter10.factory.serviceFactory;
/** 
 * ClassName: Implementation2 <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * date: 2019年1月15日 下午4:37:24 <br/> 
 * 
 * @author handm2018@126.com 
 * @version  
 */
public class Implementation2 implements Service {
    
    private Implementation2() {}

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method1");
    }
    
    public static ServiceFactory factory = new ServiceFactory() {
        
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };

}

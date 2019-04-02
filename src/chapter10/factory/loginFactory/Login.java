package chapter10.factory.loginFactory;

/**
 * ClassName: Login <br/>
 * Function: 简单工厂模式，接口login. <br/>
 * date: 2019年1月15日 下午5:51:33 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public interface Login {
    public boolean verify(String name, String password);
}

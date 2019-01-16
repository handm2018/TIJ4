package chapter10.factory.loginFactory;

/**
 * ClassName: DomainLogin <br/>
 * Function: 域登陆方式. <br/>
 * date: 2019年1月16日 下午5:18:56 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class DomainLogin implements Login {

    /** 
          * 登陆验证
     */
    @Override
    public boolean verify(String name, String password) {
        /**
                  * 业务逻辑
         */
        return true;
    }

}

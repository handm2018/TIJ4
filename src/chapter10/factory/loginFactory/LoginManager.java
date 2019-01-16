package chapter10.factory.loginFactory;

/**
 * ClassName: LoginManager <br/>
 * Function: 登录方式选择. <br/>
 * date: 2019年1月16日 下午5:24:56 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class LoginManager {
    public static Login factory(String type) {
        if ("domain".equals(type)) {
            return new DomainLogin();
        } else if ("password".equals(type)) {
            return new PasswordLogin();
        } else {
            throw new RuntimeException("无此登陆方式");
        }
    }
}

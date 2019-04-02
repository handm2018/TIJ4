package chapter10.factory.loginFactory;

/**
 * ClassName: LoginTest <br/>
 * Function: login测试，简单工厂方法测试. <br/>
 * date: 2019年1月16日 下午5:35:01 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class LoginTest {

    public static void main(String[] args) {
        String type = "password";

        // 以下是使用简单工厂模式后的逻辑
        Login login = LoginManager.factory(type);
        boolean verify = login.verify("", "");

        if (verify) {
            // 登录成功，业务逻辑
        } else {
            // 登录失败业务逻辑
        }


        // 以下是不使用工厂模式

        if ("password".equals(type)) {
            PasswordLogin passwordLogin = new PasswordLogin();
            boolean verify2 = passwordLogin.verify("", "");
            if (verify2) {

            } else {

            }

        } else if ("domain".equals(type)) {
            DomainLogin domainLogin = new DomainLogin();
            boolean verify2 = domainLogin.verify("", "");
            if (verify2) {

            } else {

            }

        } else {

        }

    }

}

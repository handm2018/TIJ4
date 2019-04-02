package chapter10.factory.loginFactory;
/** 
 * ClassName: PasswordLogin <br/> 
 * Function: 账号密码验证登陆方式. <br/> 
 * date: 2019年1月16日 下午5:21:49 <br/> 
 * 
 * @author handm2018@126.com 
 * @version  
 */
public class PasswordLogin implements Login {

    /** 
          * 账号密码登陆验证. 
     */
    @Override
    public boolean verify(String name, String password) {
        // 此处写业务逻辑
        return true;
    }

}

package chapter20;

/**
 * @author ：handongming
 * @date ：Created in 2019/8/14 17:23
 * @description：
 * @modified By：
 * @version:
 */
public class PasswordUtils {

    @UseCase(id = 47,description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }
}

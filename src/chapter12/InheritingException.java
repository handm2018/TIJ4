package chapter12;

/**
 * @author ：handongming
 * @date ：Created in 2019/8/1 13:38
 * @description：
 * @modified By：
 * @version: $
 */
public class InheritingException {

    public void f() throws SimpleException{
        System.out.println("throw simpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException sed = new InheritingException();
        try{
            sed.f();
        }catch (SimpleException e){
            System.out.println("exception");
        }

    }

}

class SimpleException extends Exception{ }

package chapter15_exception;

/**
 *@program: TIJ4
 *@description:
 *@author: 韩东明
 *@date: 2020/05/15 11:34
 */
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }
    }

}

class SimpleException extends Exception {}

package chapter15_exception;

/**
 *@program: TIJ4
 *@description: 接收字符串参数的自定义异常类
 *@author: 韩东明
 *@date: 2020/05/15 13:27
 */
public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            // 信息被发送到了 System.out
            e.printStackTrace(System.out);
            e.printStackTrace(); //信息就会被输出到标准错误流
        }
    }
}

class MyException extends Exception {
    MyException() {
    }

    MyException(String msg) {
    }
}
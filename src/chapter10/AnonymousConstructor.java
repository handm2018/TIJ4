package chapter10;

/**
 * ClassName: AnonymousConstructor <br/>
 * Function: 匿名内部类的实例化，在实例化过程中可以做一些类似构造器的行为. <br/>
 * date: 2019年1月15日 下午3:22:25 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class AnonymousConstructor {
    public static Base base(int i) {
        return new Base(i) {
            {
                System.out.println("inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = AnonymousConstructor.base(3);
        base.f();
    }
}


abstract class Base {
    public Base(int i) {
        System.out.println("base contructor,i=" + i);
    }

    public abstract void f();
}

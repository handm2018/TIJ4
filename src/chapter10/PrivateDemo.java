package chapter10;

/**
 * ClassName: PrivateDemo <br/>
 * Function: 内部类对外部类造成的影响. <br/>
 * date: 2019年1月14日 上午11:40:32 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class PrivateDemo {
    private int i = 10;

    private void f() {
        System.out.println("PrivateDemo.f()");
    }

    class Inner {
        public void changeValue() {
            i = 20;
            f();
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        PrivateDemo pd = new PrivateDemo();
        System.out.println("----" + pd.i);
        pd.f();
        Inner inner = pd.getInner();
        inner.changeValue();
        System.out.println("----" + pd.i);
    }
}

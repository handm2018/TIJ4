package chapter10.innerb;

import chapter10.inner.SimpleInterface;
import chapter10.innera.SimpleClass;

/**
 * ClassName: ProtectedInner <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月14日 上午11:28:31 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class ProtectedInner extends SimpleClass {

    public SimpleInterface get() {
        return new Inner();
    }

    public static void main(String[] args) {
        new ProtectedInner().get().f();
    }
    
}

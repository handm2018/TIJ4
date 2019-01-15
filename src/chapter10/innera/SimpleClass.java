package chapter10.innera;

import chapter10.inner.SimpleInterface;

/** 
 * ClassName: SimpleClass <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * date: 2019年1月14日 上午10:48:57 <br/> 
 * 
 * @author handm2018@126.com 
 * @version  
 */
public class SimpleClass {
    
    protected class Inner implements SimpleInterface{

        public Inner() {};
        
        @Override
        public void f() {
            System.out.println("Inner.f()");
        }
        
    }
    
}

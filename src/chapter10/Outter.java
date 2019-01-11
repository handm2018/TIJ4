package chapter10;
/** 
 * ClassName: Outter <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2019年1月11日 上午11:46:52 <br/> 
 * 
 * @author handm2018@126.com 
 * @version  
 */
public class Outter {
    
    class Inner{
        public Inner() {
            System.out.println("Inner created");
        }
    }

    public Inner getInner() {
        return new Inner();
    }
    
    public static void main(String[] args) {
        Outter out = new Outter();
        Inner inner = out.getInner();
    }
    
}

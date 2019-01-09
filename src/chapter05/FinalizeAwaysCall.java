/**  
 * Project Name:Thinking In Java  
 * File Name:FinalizeAwaysCall.java  
 * Package Name:chapter05  
 * Date:2018年12月11日下午4:53:27  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:FinalizeAwaysCall <br/>  
 * Function: finalize（）方法总会被调用的例子 <br/>  
 * Reason: . <br/>  
 * Date:     2018年12月11日 下午4:53:27 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class FinalizeAwaysCall {
    @Override
    protected void finalize() throws Throwable {
         System.out.println("finalize() method called");
    }
    
    public static void main(String[] args) {
        new FinalizeAwaysCall();
        System.gc();
        System.runFinalization();
    }
}
  

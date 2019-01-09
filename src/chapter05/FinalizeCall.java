/**  
 * Project Name:Thinking In Java  
 * File Name:FinalizeCall.java  
 * Package Name:chapter05  
 * Date:2018年12月11日下午4:38:30  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:FinalizeCall <br/>  
 * Function: FinalizeCall. <br/>  
 * Reason:   你很可能看不到finalize方法被调用，因为程序通常不会生成足够的垃圾供收集器运行. <br/>  
 * Date:     2018年12月11日 下午4:38:30 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class FinalizeCall {
    @Override
    protected void finalize() throws Throwable {
          
        System.out.println("finalize() method call");
    }
    
    public static void main(String[] args) {
        new FinalizeCall();
    }
}
  

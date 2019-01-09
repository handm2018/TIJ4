/**  
 * Project Name:Thinking In Java  
 * File Name:InitalClass.java  
 * Package Name:chapter05  
 * Date:2018年12月7日下午3:39:02  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:InitalClass <br/>  
 * Date:     2018年12月7日 下午3:39:02 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class InitalClassString {
    
    String name;
    public InitalClassString(){
        
    };
    
    public static void main(String[] args) {
        InitalClassString initalClass = new InitalClassString();
        String name2 = initalClass.name;
        System.out.println("-------"+name2);
    }
}
  

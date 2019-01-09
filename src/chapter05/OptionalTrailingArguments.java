/**  
 * Project Name:Thinking In Java  
 * File Name:OptionalTrailingArguments.java  
 * Package Name:chapter05  
 * Date:2018年12月13日下午5:50:17  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:OptionalTrailingArguments <br/>  
 * Function: 可变参数列表. <br/>  
 * Date:     2018年12月13日 下午5:50:17 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class OptionalTrailingArguments {
  
  static void f(int required,String... triling){
    System.out.print("required : "+ required);
    for (String tril : triling) {
      System.out.print(" "+tril+" ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    f(1, "one");
    f(3, "one","two","three");
    f(0);
  }

}
  

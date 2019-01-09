/**  
 * Project Name:Thinking In Java  
 * File Name:StringInstanceInitalization.java  
 * Package Name:chapter05  
 * Date:2018年12月13日下午3:33:21  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:StringInstanceInitalization <br/>  
 * Function: String类型非静态实例化，非静态代码块. <br/>  
 * Date:     2018年12月13日 下午3:33:21 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class StringInstanceInitalization {
  String string;
  {
    string = "instance initalization";
    System.out.println("非静态代码块string初始化");
  }
  
  StringInstanceInitalization(){
    System.out.println("无参构造函数初始化");
  }
  
  StringInstanceInitalization(int i){
    System.out.println("有参构造函数初始化"+string);
  }
  
  public static void main(String[] args) {
    new StringInstanceInitalization();
    
    new StringInstanceInitalization(1);
    
  }
}
  

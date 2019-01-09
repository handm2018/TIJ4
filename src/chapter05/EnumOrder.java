/**  
 * Project Name:Thinking In Java  
 * File Name:EnumOrder.java  
 * Package Name:chapter05  
 * Date:2018年12月14日上午10:45:22  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:EnumOrder <br/>  
 * Function: 枚举类的基本特性.ordinal()返回此枚举常数的序数（其枚举声明中的位置，其中初始常数的序数为零）,多数程序员将不会使用这种方法。 它被设计为使用复杂的基于枚举的数据结构，如EnumSet和EnumMap 。 
。  <br/>  
 * Date:     2018年12月14日 上午10:45:22 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class EnumOrder {
  public static void main(String[] args) {
    for (Spiciness s : Spiciness.values()) {
      System.out.println(s+", ordinal="+s.ordinal());
    }
  }
}
  

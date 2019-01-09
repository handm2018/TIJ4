/**  
 * Project Name:Thinking In Java  
 * File Name:ObjectReferences.java  
 * Package Name:chapter05  
 * Date:2018年12月13日下午4:25:02  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:ObjectReferences <br/>  
 * Function: 引用类型的数组初始化. <br/>  
 * Date:     2018年12月13日 下午4:25:02 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class ObjectReferences {
  Test[] ta = new Test[5];
  public static void main(String[] args) {
    Test[] ta2 = new Test[5];
    for (int t = 0; t < ta2.length; t++) {
      ta2[t] = new Test(Integer.toString(t));
    }
  }
}


class Test{
  public Test(String s) {

    System.out.println("sting constructor : s="+s);  

  }
}

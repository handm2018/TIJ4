/**  
 * Project Name:Thinking In Java  
 * File Name:Cat.java  
 * Package Name:chapter07  
 * Date:2018年12月18日上午11:31:57  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter07;  
/**  
 * ClassName:Cat <br/>  
 * Function: 惰性 初始化另一个类的实例. <br/>  
 * Date:     2018年12月18日 上午11:31:57 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class Cat {
  private Mouse mouse;
  
  @Override
  public String toString() {
    if (mouse == null) {
      mouse = new Mouse();
    }
    System.out.println(mouse);
    return "cat eat mouse";
  }
  
  public static void main(String[] args) {
    Cat cat = new Cat();
    System.out.println(cat);
  }
}


class Mouse{
  private String color;
  private String name="jerry";
  {
    color="black and white";
  }
  
  public Mouse() {
    
    System.out.println("new Mouse()"); 
  }
  
  @Override
  public String toString() {
    return "this is a mouse"+name+color;
  }
}
  

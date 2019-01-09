/**  
 * Project Name:Thinking In Java  
 * File Name:PassObject.java  
 * Package Name:chapter03  
 * Date:2018年12月5日下午3:27:31  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter03;  
/**  
 * ClassName:PassObject <br/>  
 * Function:  ADD FUNCTION. <br/>  
 * Reason:   ADD REASON. <br/>  
 * Date:     2018年12月5日 下午3:27:31 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class PassObject {
    public static void f(Letter y){
        y.c = 'z';
    }
    
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("before : letter.c = "+letter.c);
        f(letter);
        System.out.println("after : letter.c = "+letter.c);
    }
}
  
class Letter{
    char c;
}
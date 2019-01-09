/**  
 * Project Name:Thinking In Java  
 * File Name:TerminationCondition.java  
 * Package Name:chapter05  
 * Date:2018年12月10日下午2:56:59  
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.  
 *  
*/  
  
package chapter05;  
/**  
 * ClassName:TerminationCondition <br/>  
 * Function: 每一本书都需要被签入（checkin），但是由于失误，有一本书未做checkin，此时，调用了 System.gc()强制终止程序运行，即使不这样做，等到程序运行臆断时间后，也会发现这个对象.<br/>  
 * Date:     2018年12月10日 下午2:56:59 <br/>  
 * @author   handm  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book book1 = new Book(true);
        book1.checkIn();
        new Book(true);
        System.gc();
    }
}
  

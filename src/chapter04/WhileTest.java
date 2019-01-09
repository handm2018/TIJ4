/**
 * Project Name:Thinking In Java File Name:WhileTest.java Package Name:chapter04
 * Date:2018年12月6日上午11:19:13 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:WhileTest <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月6日 上午11:19:13 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println("result : " + result);
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("<0.99");
        }
        System.out.println(">0.99");
    }
}


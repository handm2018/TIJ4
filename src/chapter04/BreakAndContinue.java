/**
 * Project Name:Thinking In Java File Name:BreakAndContinue.java Package Name:chapter04
 * Date:2018年12月7日上午9:32:20 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:BreakAndContinue <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 上午9:32:20 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 35) {
                break;
            }
            if (i % 9 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
}


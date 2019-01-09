/**
 * Project Name:Thinking In Java File Name:ListCharaters.java Package Name:chapter04
 * Date:2018年12月6日上午11:28:49 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:ListCharaters <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月6日 上午11:28:49 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class ListCharaters {

    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("value:"+(int)c+"; charater:"+c);
            }
        }
    }

}


/**
 * Project Name:Thinking In Java File Name:TernaryIfElse.java Package Name:chapter03
 * Date:2018年12月6日上午10:30:19 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter03;

/**
 * ClassName:TernaryIfElse <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月6日 上午10:30:19 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class TernaryIfElse {

    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int ifElse(int i) {
        if (i < 10) {
            return i * 100;
        } else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        int ternary1 = ternary(7);
        int ternary2 = ternary(13);
        System.out.println("ternary1 : " + ternary1 + " ; ternary2 : " + ternary2);
        int ifElse1 = ifElse(7);
        int ifElse2 = ifElse(13);
        System.out.println("ifElse1 : " + ifElse1 + " ; ifElse2 : " + ifElse2);
    }

}


/**
 * Project Name:Thinking In Java File Name:Literals.java Package Name:chapter03
 * Date:2018年12月6日上午9:43:23 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter03;

/**
 * ClassName:Literals <br/>
 * Function: ADD FUNCTION 直接常量，十六进制和八进制计数法以二进制的方式来显示. <br/>
 * Reason: ADD REASON 以0x开头，. <br/>
 * Date: 2018年12月6日 上午9:43:23 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Literals {

    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1 : " + Integer.toBinaryString(i1));
        int i2 = 0x2F;
        System.out.println("i2 : " + Integer.toBinaryString(i2));
        int i3 = 0177;
        System.out.println("i3 : " + Integer.toBinaryString(i3));
        char c = 0xffff;
        System.out.println("c : " + Integer.toBinaryString(c));
        byte b = 0x7f;
        System.out.println("b : " + Integer.toBinaryString(b));
        short s = 0x7fff;
        System.out.println("s : " + Integer.toBinaryString(s));
    }

}


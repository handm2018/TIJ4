/**
 * Project Name:Thinking In Java File Name:StaticString.java Package Name:chapter05
 * Date:2018年12月13日下午3:14:10 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:StaticString <br/>
 * Function: 静态string域，验证在使用之前就进行了初始化. <br/>
 * Date: 2018年12月13日 下午3:14:10 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class StaticString {
  static String str1 = "Initalized String in definition";
  static String str2;
  static {
    str2 = "Intalized String in static block ";
  }


  public static void main(String[] args) {
    System.out.println("string1 = " + str1);
    System.out.println("string2 = " + str2);
  }



}


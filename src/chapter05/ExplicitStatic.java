/**
 * Project Name:Thinking In Java File Name:ExplicitStatic.java Package Name:chapter05
 * Date:2018年12月13日下午2:35:33 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:ExplicitStatic <br/>
 * Function: 静态代码块初始化，静态代码块. <br/>
 * Date: 2018年12月13日 下午2:35:33 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class ExplicitStatic {
  public static void main(String[] args) {
    System.out.println("Inside main");
    Cups cups = new Cups();
    cups.cup2.f(1);
  }
}


class Cup {

  public Cup(int market) {

    System.out.println("Cup(" + market + ")");

  }

  void f(int market) {
    System.out.println("f(" + market + ")");
  }
}


class Cups {
  static Cup cup1;
  static Cup cup2;

  static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
  }

  public Cups() {

    System.out.println("Cups()");

  }

}

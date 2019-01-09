/**
 * Project Name:Thinking In Java File Name:Mugs.java Package Name:chapter05
 * Date:2018年12月13日下午3:19:49 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:Mugs <br/>
 * Function: 非静态实例初始化. <br/>
 * Date: 2018年12月13日 下午3:19:49 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Mugs {
  Mug mug1;
  Mug mug2;

  {
    mug1 = new Mug(1);
    mug2 = new Mug(2);
    System.out.println("mug1 and mug2 initalized");
  }

  Mugs() {
    System.out.println("Mugs()");
  }

  Mugs(int market) {
    System.out.println("mugs(" + market + ")");
  }

  public static void main(String[] args) {
    System.out.println("inside main");
    new Mugs();
    System.out.println("mugs completed");

    new Mugs(1);
    System.out.println("mugs(1) completed");
  }
}


class Mug {
  public Mug(int market) {

    System.out.println("Mug(" + market + ")");

  }

  void f(int market) {
    System.out.println("f(" + market + ")");
  }
}



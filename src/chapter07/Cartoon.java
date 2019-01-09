/**
 * Project Name:Thinking In Java File Name:Cartoon.java Package Name:chapter07
 * Date:2018年12月18日下午5:08:15 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter07;

/**
 * ClassName:Cartoon <br/>
 * Function: 继承关系中，Java会自动在导出类的构造器中插入对基类构造器的调用. <br/>
 * Date: 2018年12月18日 下午5:08:15 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Cartoon extends Drawing {
  public Cartoon() {
    System.out.println("Cartoon constructor");
  }

  public static void main(String[] args) {
    new Cartoon();
  }
}


class Art {
  public Art() {

    System.out.println("Art constructor");

  }
}


class Drawing extends Art {
  public Drawing() {

    System.out.println("Drawing constructor");

  }
}

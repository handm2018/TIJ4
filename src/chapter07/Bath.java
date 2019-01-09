/**
 * Project Name:Thinking In Java File Name:Bath.java Package Name:chapter07
 * Date:2018年12月18日上午9:56:41 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter07;

/**
 * ClassName:Bath <br/>
 * Function: 初始化引用对象的四种方式：1.定义对象的地方（意味着在构造器调用之前初始化）2.在构造器中3.在使用这些对象的时候（惰性初始化）4.实例初始化 <br/>
 * Date: 2018年12月18日 上午9:56:41 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Bath {
  // 方法1.在定义的地方初始化
  private String s1 = "Happy", s2 = "Happy";
  private String s3, s4;
  private Soap castille;
  private int i;
  private float toy;

  public Bath() {
    System.out.println("Inside Bath()");
    // 方法2.在类的构造器中初始化
    s3 = "joy";
    toy = 3.14f;
    castille = new Soap();
  }

  {
    // 4.构造代码块中初始化，即类实例化时初始化。
    // 构造代码块在调用类的构造函数时执行，Java在编译的时候会将这一部分内容移到构造器中先执行，然后再执行构造器中的其他代码
    System.out.println("实例化时初始化");
    i = 49;
  }

  @Override
  public String toString() {

    // 3.惰性初始化
    if (s4 == null) {
      s4 = "joy";
    }
    return "s1=" + s1 + " s2=" + s2 + " s3=" + s3 + " s4=" + s4 + "\n" + "i=" + i + "\n" + "toy=" + toy + "\n"
        + "castille=" + castille;
  }

  public static void main(String[] args) {
    Bath bath = new Bath();
    System.out.println(bath);
  }
}


class Soap {
  private String s;

  public Soap() {
    System.out.println("Soap()");
    s = "Constructor";
  }

  @Override
  public String toString() {
    return s;
  }
}

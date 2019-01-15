/**  
 * Project Name:ThingkingInJava  
 * File Name:DotThis.java  
 * Package Name:chapter10  
 * Date:2019年1月12日下午5:06:57  
 * Copyright (c) 2019, handm2018@126.com All Rights Reserved.  
 *  
 */

package chapter10;

/**  
 * ClassName: DotThis. <br/>  
 * Function: 如果需要在内部类中生成对外部类对象的引用，可以使用语法：外部类的名字后面紧跟圆点加this。这样产生的引用自动具有正确的类型
 * 这一点在编译器就受到检查并被知晓，因此并没有任何运行时的开销. <br/>  
 * date: 2019年1月12日 下午5:06:57. <br/>  
 *  
 * @author handm2018@126.com  
 * @version   
 */
public class DotThis {
  void f() {
    System.out.println("DotThis.f()");
  }

  public class Inner {
    public DotThis getOuThis() {
      return DotThis.this;
    }
  }

  public Inner getInner() {
    return new Inner();
  }

  public static void main(String[] args) {
    DotThis dThis = new DotThis();
    Inner inner = dThis.getInner();
    inner.getOuThis().f();
  }

}


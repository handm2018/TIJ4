/**
 * Project Name:Thinking In Java File Name:Burrito.java Package Name:chapter05
 * Date:2018年12月14日上午11:04:42 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:Burrito <br/>
 * Function: 墨西哥卷饼类，使用辛辣程度的枚举类型作为属性，并使用switch-case. <br/>
 * Date: 2018年12月14日 上午11:04:42 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Burrito {
  Spiciness degree;

  public Burrito(Spiciness degree) {
    this.degree = degree;
  }

  public void describe() {
    switch (degree) {
      case NOT:
        System.out.println("not spicy at all.");
        break;
      case MILD:
      case MEDIUM:
        System.out.println("a little hot.");
        break;
      case HOT:
      case FLAMING:
      default:
        System.out.println("maybe too hot.");
        break;
    }
  }

  public static void main(String[] args) {
    Burrito plain = new Burrito(Spiciness.NOT), greenChile = new Burrito(Spiciness.MILD),
        jalapeno = new Burrito(Spiciness.HOT);

    plain.describe();
    greenChile.describe();
    jalapeno.describe();
  }
}


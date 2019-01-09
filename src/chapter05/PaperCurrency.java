/**
 * Project Name:Thinking In Java File Name:PaperCurrency.java Package Name:chapter05
 * Date:2018年12月14日上午11:22:05 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:PaperCurrency <br/>
 * Function: 纸币类，枚举类型以及其在switch-case的应用. <br/>
 * Date: 2018年12月14日 上午11:22:05 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class PaperCurrency {

  PaperCurrencyTypes types;

  public PaperCurrency(PaperCurrencyTypes types) {
    this.types = types;
  }

  public static void describe2(PaperCurrencyTypes type) {
    switch (type) {
      case ONE:
        System.out.println("杭州西湖");
        break;
      case FIVE:
        System.out.println("山东泰山");
        break;
      case TEN:
        System.out.println("长江三峡");
        break;
      case TWENTY:
        System.out.println("桂林漓江");
        break;
      case FIFTY:
        System.out.println("西藏布达拉宫");
        break;
      default:
        System.out.println("没有该面值的纸币");
        break;
    }
  }

  public void describe() {
    switch (types) {
      case ONE:
        System.out.println("杭州西湖");
        break;
      case FIVE:
        System.out.println("山东泰山");
        break;
      case TEN:
        System.out.println("长江三峡");
        break;
      case TWENTY:
        System.out.println("桂林漓江");
        break;
      case FIFTY:
        System.out.println("西藏布达拉宫");
        break;
      default:
        System.out.println("没有该面值的纸币");
        break;
    }
  }

  public static void main(String[] args) {
    PaperCurrency one = new PaperCurrency(PaperCurrencyTypes.ONE), ten = new PaperCurrency(PaperCurrencyTypes.TEN),
        fifty = new PaperCurrency(PaperCurrencyTypes.FIFTY);
    one.describe();
    ten.describe();
    fifty.describe();

    System.out.println("static method start ");
    for (PaperCurrencyTypes type : PaperCurrencyTypes.values()) {
      PaperCurrency.describe2(type);
    }

  }

}


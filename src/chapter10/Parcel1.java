/**
 * Project Name:ThingkingInJava File Name:Parcel1.java 
 * Package Name:chapter10
 * Date:2019年1月10日下午4:22:13 Copyright (c) 2019, 
 * handm2018@126.com All Rights Reserved.
 * 
 */

package chapter10;

/**
 * ClassName: Parcel1. <br/>
 * Function: 初识内部类，内部类的创建与使用. <br/>
 * date: 2019年1月10日 下午4:22:13. <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Parcel1 {
  
  class Contents {
    private int i = 11;

    public int value() {
      return i;
    }
  }

  class Destination {
    private String lable;

    public Destination(String whereTo) {
      super();
      this.lable = whereTo;
    }
    
    public String readLable() {
      return lable;
    }
  }
  
  public void ship(String dest) {
    Contents contents = new Contents();
    Destination destination = new Destination(dest);
    System.out.println(destination.lable);
  }
  
  public static void main(String[] args) {
    Parcel1 parcel1 = new Parcel1();
    parcel1.ship("HangZhou");
  }
  
}


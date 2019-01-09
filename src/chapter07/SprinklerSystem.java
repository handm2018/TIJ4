/**
 * Project Name:Thinking In Java File Name:SprinklerSystem.java Package Name:chapter07
 * Date:2018年12月17日上午9:45:10 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter07;

/**
 * ClassName:SprinklerSystem <br/>
 * Function: 复用类的第一种方法，组合语法，即只需将类的引用置于新的类中即可. <br/>
 * Date: 2018年12月17日 上午9:45:10 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class SprinklerSystem {
  private String value1, value2, value3, value4;
  private WaterSource waterSource = new WaterSource();
  private int i;
  private float f;

  @Override
  public String toString() {

    return "value1=" + value1 + " value2=" + value2 + " value3=" + value3 + " value4=" + value4 + "\n" + "i=" + i
        + " f=" + f + "\n" + waterSource;
  }

  public static void main(String[] args) {
    SprinklerSystem sprinklerSystem = new SprinklerSystem();
    System.out.println(sprinklerSystem);
  }
}


class WaterSource {
  private String s;

  WaterSource() {
    System.out.println("WaterSource()");
    s = "constructor";
  }

  @Override
  public String toString() {
    return s;
  }
}

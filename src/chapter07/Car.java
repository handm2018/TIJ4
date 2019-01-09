/**
 * Project Name:Thinking In Java File Name:Car.java Package Name:chapter07 Date:2018年12月21日下午3:42:29
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter07;

/**
 * ClassName:Car <br/>
 * Function: ADD FUNCTION. <br/>
 * Date: 2018年12月21日 下午3:42:29 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Car {
  public Engine engine = new Engine();
  public Wheel[] wheel = new Wheel[4];
  public Door left = new Door(), right = new Door();

  public Car() {
    for (int i = 0; i < 4; i++) {
      wheel[i] = new Wheel();
    }
  }

  public static void main(String[] args) {
    Car car = new Car();
    car.left.window.rollup();
    car.wheel[0].inflate(72);
    car.engine.service();
  }
}


class Engine {
  public void start() {}

  public void rev() {}

  public void stop() {}

  public void service() {
    System.out.println("启动引擎");
  }
}


class Wheel {
  public void inflate(int psi) {}
}


class Window {
  public void rollup() {}

  public void rolldown() {}
}


class Door {
  public Window window = new Window();

  public void open() {}

  public void close() {}
}



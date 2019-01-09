/**
 * Project Name:Thinking In Java File Name:CADSystem.java Package Name:chapter07
 * Date:2018年12月20日下午6:03:36 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter07;

/**
 * ClassName:CADSystem <br/>
 * Function: CAD画图系统的一部分，结合使用组合和继承的复用类方式. <br/>
 * Date: 2018年12月20日 下午6:03:36 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class CADSystem extends Shape{
  
  private Circle circle;
  private Triangle triangle;
  private Line[] lines = new Line[3];
  
  public CADSystem(int i) {
    super(i+1);
    for (int j = 0; j < lines.length; j++) {
      lines[j]=new Line(j, j*j);
    }
    circle = new Circle(1);
    triangle = new Triangle(1);
    System.out.println("Combined Constructor");
  }
  
  @Override
  public void dispose() {
    System.out.println("CADSystem.dispose()");
    triangle.dispose();
    circle.dispose();
    for (int i = 0; i < lines.length; i++) {
      lines[i].dispose();
    }
    super.dispose();
  }
  
  public static void main(String[] args) {
    CADSystem x=new CADSystem(49);
    try {
      //此处写业务逻辑
    } finally {
      //保证x总是会释放
      x.dispose();
    } 
  }
}


class Shape {
  public Shape(int i) {
    System.out.println("Shape Contructor");
  }

  public void dispose() {
    System.out.println("Shape dispose");
  }
}


class Circle extends Shape {
  public Circle(int i) {
    super(i);
    System.out.println("Drawing Circle");
  }

  @Override
  public void dispose() {
    System.out.println("Erasing Circle");
    super.dispose();
  }
}



class Triangle extends Shape {
  public Triangle(int i) {
    super(i);
    System.out.println("Drawing Triangle");
  }

  @Override
  public void dispose() {
    System.out.println("Erasing Triangle");
    super.dispose();
  }
}


class Line extends Shape {
  private int start, end;

  Line(int start, int end) {
    super(start);
    this.start = start;
    this.end = end;
    System.out.println("Drawing Line: " + start + "," + end);
  }
  
  public void dispose(){
    System.out.println("Erasing Line: "+start+","+end);
    super.dispose();
  }
}



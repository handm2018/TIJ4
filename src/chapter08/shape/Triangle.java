package chapter08.shape;

/**
 * 三角形继承自图形类
 */
public class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

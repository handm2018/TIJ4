package chapter08.shape;

/**
 * 正方形继承自图形类
 */
public class Square extends Shape {
    public void draw() {
        System.out.println("Square.draw()");
    }

    public void erase() {
        System.out.println("Square.erase()");
    }
}

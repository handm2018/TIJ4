package chapter08.shape;

/**
 * 多态的实现
 */
public class Shapes {
    private static RandomShapeGenerator shapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = shapeGenerator.next();
        }
        for (Shape shp : s
        ) {
            shp.draw();
        }
    }
}

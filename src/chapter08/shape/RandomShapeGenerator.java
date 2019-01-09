package chapter08.shape;

import java.util.Random;

/**
 * 随机创建继承自图形类的子类的实例工厂
 */
public class RandomShapeGenerator {
    private Random rand = new Random(49);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public static void main(String[] args) {
        Random rand = new Random(49);
        int i1 = rand.nextInt();
        int i2 = rand.nextInt();
        int i3 = rand.nextInt(3);
        int i4 = rand.nextInt(3);
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);

    }
}

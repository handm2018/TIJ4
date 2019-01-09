package chapter08.glyph;

/**
 * 当构造器中发生多态时，可能会产生问题。基类构造器中调用了draw（）方法，但子类产生了覆盖，
 * 调用时发生了多态。此时子类的属性radius还未加载初始化，因此导致问题
 * Glyph() before draw()
 * RoundGlyph.draw(),radius=0
 * Glyph() after draw()
 * RoundGlyph.RoundGlyph(),radius=5
 *
 *
 * 解决办法：
 * 1.尽可能的是构造器方法简单化，即避免调用其他方法
 * 2.构造器中唯一能够安全调用的方法是基类中的final方法（也适用于private方法，它们自动属于final方法）
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}


class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");

    }
}


class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius="+radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(),radius="+radius);
    }
}

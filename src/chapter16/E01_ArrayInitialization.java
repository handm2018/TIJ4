package chapter16;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E01_ArrayInitialization.java
 * @Description 接收BerylliumSphere[]作为参数的方法，验证数组动态初始化的两种方式，分别在那种情况下使用
 * @createTime 2019年04月15日 15:00:00
 */
public class E01_ArrayInitialization {

    /**
     * 接收BerylliumSphere[]作为参数的方法，验证数组动态初始化的两种方式，分别在那种情况下使用
     * @param spheres
     */
    static void hide(BerylliumSphere[] spheres) {
        System.out.println("spheres.lenght:"+spheres.length);
    }

    public static void main(String[] args) {
        hide(new BerylliumSphere[] {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()});
        //不接收此种初始化方法的数组
        //hide({new BerylliumSphere(),new BerylliumSphere()});

        BerylliumSphere[] spheres = {new BerylliumSphere(),new BerylliumSphere()};
        hide(spheres);
    }
}

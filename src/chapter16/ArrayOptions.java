package chapter16;

import java.util.Arrays;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName ArrayOptions.java
 * @Description 数组初始化的方式
 * @createTime 2019年04月15日 09:34:00
 */
public class ArrayOptions {

    public static void main(String[] args) {
        //声明未初始化
        BerylliumSphere[] a;
        //声明并初始化容量为5的数组
        BerylliumSphere[] b = new BerylliumSphere[5];
        //数组中的引用初始化为null
        System.out.println(Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }
        //动态初始化数组
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        //length属性只是表示数组容量的大小
        System.out.println("a.length:" + a.length);
        System.out.println("b.length:" + b.length);
        System.out.println("c.length:" + c.length);
        System.out.println("d.length:" + d.length);
        a = d;
        System.out.println(a.length);

        //引用类型的数组与基本类型的数组用法一样
        int[] e;
        int[] f = new int[5];
        //基本类型的数组，若是数值型初始化为0
        System.out.println(Arrays.toString(f));
        int[] g = new int[5];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }
        int[] h = {7, 8, 9, 10};
        e = new int[]{11, 12, 13, 14, 15, 16};
        System.out.println("e.length:" + e.length);
        System.out.println("f.length:" + f.length);
        System.out.println("g.length:" + g.length);
        System.out.println("h.length:" + h.length);
        e = h;
        System.out.println(e.length);
    }
}

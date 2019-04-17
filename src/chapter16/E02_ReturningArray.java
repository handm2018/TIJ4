package chapter16;

import java.util.Arrays;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E02_ReturningArray.java
 * @Description 练习2，返回一个数组对象
 * @createTime 2019年04月17日 10:46:00
 */
public class E02_ReturningArray {

    private static BerylliumSphere[] creatArray(int n){
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[n];
        for (int i = 0; i < n; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        return berylliumSpheres;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(creatArray(5)));
    }
}

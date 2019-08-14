package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName ContainerComparition.java
 * @Description 数组和其他容器的比较
 * @createTime 2019年04月09日 17:16:00
 */
public class ContainerComparition {

    public static void main(String[] args) {

        /**
         * 数组容器 存储引用类型 获取方式是下标[i]
         */
        BerylliumSphere[] spheres = new BerylliumSphere[12];
        for (int i = 0; i < 10; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        /**
         * 其他容器 存储引用类型 获取和放置方式是get() add()
         */
        List<BerylliumSphere> sphereList = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

        /**
         * 数组可以存储基本数据类型
         */
        int[] integers = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);

        /**
         * 其他容器，再有了自动包装类型以后，也可以存储基本数据类型(包装类)了,至此，数组的唯一优势就是效率了
         */
        List<Integer> integerList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        integerList.add(99);
        System.out.println(integerList);
        System.out.println(integerList.get(4));


    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere"+id;
    }
}

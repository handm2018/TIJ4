package chapter16;

import java.util.Arrays;
import java.util.Random;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName MultidimensionalArray.java
 * @Description 多维数组    Arrays.deepToString()方法，多维数组的打印
 * @createTime 2019年04月17日 10:56:00
 */
public class MultidimensionalArray {

    public static void main(String[] args) {
        //多维数组的第一种声明方式：{}并初始化
        int[][] multiIntegerArray = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(multiIntegerArray));

        //多维数组的第二种声明方式：new ，如果不对元素进行显示初始化，基本类型int初始化0，引用类型初始化null
        int[][][] array1 = new int[3][3][4];
        BerylliumSphere[][][] array2 = new BerylliumSphere[2][2][2];
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));

        //粗糙数组：数组中构成矩阵的每个向量都可以有任意长度。对象数组的构造方式和基本类型类似
        Random random = new Random(47);
        int[][][] array3 = new int[random.nextInt(7)][][];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = new int[random.nextInt(5)][];
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = new int[random.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(array3));
    }

}

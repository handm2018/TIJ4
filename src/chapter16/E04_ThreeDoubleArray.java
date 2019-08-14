package chapter16;

import java.util.Arrays;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E04_ThreeDoubleArray.java
 * @Description TODO
 * @createTime 2019年04月18日 16:56:00
 */
public class E04_ThreeDoubleArray {

    private double[][][] createArray(int xLen, int yLen, int zLen, double valStart, double valEnd) {
        double[][][] array = new double[xLen][yLen][zLen];
        double start = valStart;
        double increment = (valStart - valEnd) / (xLen * yLen * zLen);
        for (int i = 0; i < xLen; i++) {
            array[i] = new double[yLen][zLen];
            for (int j = 0; j < yLen; j++) {
                array[i][j] = new double[zLen];
                for (int k = 0; k < zLen; k++) {
                    array[i][j][k] = start;
                    start += increment;
                }
            }
        }
        return array;
    }

    private void printArray(double array[][][]){
        System.out.println(Arrays.deepToString(array));
    }

}

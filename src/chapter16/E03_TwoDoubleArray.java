package chapter16;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName E03_TwoDoubleArray.java
 * @Description 编写一个方法，产生二维双精度浮点型数组并初始化，数组的大小由传入参数决定，初始值必须在另外两个形式参数的值之间
 * @createTime 2019年04月17日 11:25:00
 */
public class E03_TwoDoubleArray {

    private static double[][] createArray(int xLen, int yLen, double start, double end) {
        double[][] array = new double[xLen][yLen];
        double increment = (end - start) / (xLen * yLen);
        double valStart = start;
        for (int i = 0; i < xLen; i++) {
            array[i] = new double[yLen];
            for (int j = 0; j < yLen; j++) {
                array[i][j] = valStart;
                valStart += increment;
            }
        }
        return array;
    }

    private static void printArray(double[][] array){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(decimalFormat.format(array[i][j]));
                System.out.printf(Locale.CHINESE,"%.2f",array[i][j]);
                System.out.printf(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] array1 = createArray(3,4,4.5,55.5);
        printArray(array1);
    }

}

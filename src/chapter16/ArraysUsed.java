package chapter16;

import java.util.Arrays;
import java.util.List;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName ArraysUsed.java
 * @Description Arrays类常用方法使用
 * @createTime 2019年05月21日 16:15:00
 */
public class ArraysUsed {

    public static void main(String[] args) {
        int[] arr = {3, 5, 15, 10, 2, 25, 78, 67, 45, 90};
        System.out.println("一维数组打印：" + Arrays.toString(arr));

        int[][] arrs = {{19, 34, 45, 36, 27}, {21, 22, 23, 24, 25}, {46, 47, 48, 49}, {7, 12, 13, 14, 15, 16}, {1, 2, 3, 4, 5, 6}};
        System.out.println("多维数组打印：" + Arrays.deepToString(arrs));

        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("数组转换list：");
        for (Integer val : asList) {
            System.out.print(val + " ");
        }
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean flag = Arrays.equals(arr, arr2);
        System.out.println("数组比较："+flag);

        //binarySearch方法支持在整个数组中查找，如：
        int dex = Arrays.binarySearch(arr2,4);
        System.out.println("4在数组arr2中的下标是："+dex);
        //以及在某个区间范围内查找，如：
        int index = Arrays.binarySearch(arr2,2,6,6);
        System.out.println("5在数组arr2中的下标是："+index);

        int[] copyOfArr2 = Arrays.copyOf(arr2,5);
        System.out.println(Arrays.toString(copyOfArr2));
        int[] copyOfRangeArr2 = Arrays.copyOfRange(arr2,2,9);
        System.out.println(Arrays.toString(copyOfRangeArr2));

        Arrays.sort(arr,4,9);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,3,9,9);
        System.out.println(Arrays.toString(arr));


    }
}

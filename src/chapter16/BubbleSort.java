package chapter16;

import java.util.Arrays;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName BubbleSort.java
 * @Description 冒泡排序
 * @createTime 2019年05月06日 17:13:00
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = getArr1();
        System.out.println("排序完成后：" + Arrays.toString(arr));
        int[] arr2 = getArr2();
        System.out.println("排序完成后：" + Arrays.toString(arr2));
        int[] arr3 = getArr3();
        System.out.println("排序完成后：" + Arrays.toString(arr3));

    }

    private static int[] getArr3() {
        int[] arr3 = {3, 9, 23, 1, 4, 18, 10, 7,35,12,5};
        int count = 1;
        int satrt = 0;
        int end = arr3.length - 1;
        while (satrt < end) {
            int flags = 0;
            int flage = 0;
            for (int i = 0; i < end; i++) {
                if (arr3[i] > arr3[i + 1]) {
                    flage = i;
                    int temp = arr3[i];
                    arr3[i] = arr3[i + 1];
                    arr3[i + 1] = temp;
                }
            }
            end = flage;
            for (int i = end; i > 0; i--) {
                if (arr3[i] < arr3[i - 1]) {
                    flags = i;
                    int temp = arr3[i];
                    arr3[i] = arr3[i - 1];
                    arr3[i - 1] = temp;
                }
            }
            satrt = flags;
            System.out.println("第" + (count++) + "次排序后：" + Arrays.toString(arr3));
        }
        return arr3;
    }

    private static int[] getArr2() {
        int[] arr2 = {3, 9, 23, 1, 4, 18, 10, 7,35,12,5};
        int i = arr2.length - 1;
        int count = 1;
        while (i > 0) {
            int flag = 0;
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    flag = j;
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
            System.out.print("第" + count + "次排序后：");
            System.out.println(Arrays.toString(arr2));
            i = flag;
            count++;
        }
        return arr2;
    }

    private static int[] getArr1() {
        int[] arr = {3, 9, 23, 1, 4, 18, 10, 7,35,12,5};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.print("第" + (i + 1) + "次排序后：");
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}

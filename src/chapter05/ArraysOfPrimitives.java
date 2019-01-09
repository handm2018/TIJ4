/**
 * Project Name:Thinking In Java File Name:ArraysOfPrimitives.java Package Name:chapter05
 * Date:2018年12月13日下午3:54:37 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:ArraysOfPrimitives <br/>
 * Function: 数组初始化与复制. <br/>
 * Date: 2018年12月13日 下午3:54:37 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class ArraysOfPrimitives {
  public static void main(String[] args) {
    // 定义int类型数组并初始化（分配存储空间）
    int[] arr1 = {1, 2, 3, 4, 5, 6};
    int[] arr2;
    // arr1赋值给arr2，也就是指向了同一个内存地址
    arr2 = arr1;
    // 对arr2的改变也是对arr1的改变
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = arr2[i] + 1;
    }
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
  }
}


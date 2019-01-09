/**
 * Project Name:Thinking In Java File Name:Equivalence.java Package Name:chapter03
 * Date:2018年12月5日下午4:22:35 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter03;

/**
 * ClassName:Equivalence <br/>
 * Function: 逻辑运算符 == 和 != . <br/>
 * Reason: 下面代码中实际上比较的是对象，即引用类型，此时使用== 或 !=是比较的引用地址。所以基本数据类型的比较使用==和!=,引用类型的比较使用equals()方法. <br/>
 * Date: 2018年12月5日 下午4:22:35 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer i1 = new Integer(36);
        Integer i2 = new Integer(81);

        // i1 == i2 : false
        System.out.println("i1 == i2 : " + (i1 == i2));
        // i1 != i2 : true
        System.out.println("i1 != i2 : " + (i1 != i2));

    }
}


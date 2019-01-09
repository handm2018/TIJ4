/**
 * Project Name:Thinking In Java File Name:RandomInts.java Package Name:chapter04
 * Date:2018年12月6日下午2:54:01 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

import java.util.Random;

/**
 * ClassName:RandomInts <br/>
 * Function: ADD FUNCTION. 产生25个int类型的随机数<br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月6日 下午2:54:01 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class RandomInts {

    static Random rand = new Random(49);

    public static void compareRand() {
        int i1 = rand.nextInt();
        int i2 = rand.nextInt();

        System.out.println("i1:" + i1 + "; i2:" + i2);

        if (i1 > i2) {
            System.out.println("i1>i2");
        }
        if (i1 < i2) {
            System.out.println("i1<i2");
        }
        if (i1 == i2) {
            System.out.println("i1=i2");
        }
    }

    public static void main(String[] args) {
        for(int i = 0;i<25;i++){
            compareRand();
        }
    }

}


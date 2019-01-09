/**
 * Project Name:Thinking In Java File Name:Speed.java Package Name:chapter03
 * Date:2018年12月5日下午3:47:28 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter03;

import java.util.Random;

/**
 * ClassName:Speed <br/>
 * Function: ADD FUNCTION 计算速度的例子，距离和时间是常量. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月5日 下午3:47:28 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Speed {

    static Random rand = new Random(81);

    public static void main(String[] args) {

        int distance = rand.nextInt(100) + 324;

        int time = rand.nextInt(100) + 21;

        float speed = distance / time;

        System.out.println("the speed : " + speed + "m/s");
    }

}


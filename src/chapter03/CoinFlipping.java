/**
 * Project Name:Thinking In Java File Name:CoinFlipping.java Package Name:chapter03
 * Date:2018年12月5日下午5:33:42 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter03;

import java.util.Random;

/**
 * ClassName:CoinFlipping <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月5日 下午5:33:42 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class CoinFlipping {

    public static void main(String[] args) {
        Random rand = new Random();

        boolean nextBoolean = rand.nextBoolean();

        System.out.println("----" + (nextBoolean ? "head" : "tail"));
    }

}


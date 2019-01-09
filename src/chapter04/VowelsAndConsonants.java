/**
 * Project Name:Thinking In Java File Name:VowelsAndConsonants.java Package Name:chapter04
 * Date:2018年12月7日上午10:54:17 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

import java.util.Random;

/**
 * ClassName:VowelsAndConsonants <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 上午10:54:17 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random random = new Random(36);

        for (int m = 0; m < 10; m++) {
            int i = random.nextInt(26) + 'a';
            System.out.println("character:" + (char) i);

            switch (i) {
                case 'a':
                    System.out.println("it is a");
                    break;
            }

        }

    }
}


/**
 * Project Name:Thinking In Java File Name:FindPrimes.java Package Name:chapter04
 * Date:2018年12月6日下午4:11:55 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:FindPrimes <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月6日 下午4:11:55 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class FindPrimes {

    public static void main(String[] args) {
        int max = 100;
        if (args.length != 0) {
            max = Integer.parseInt(args[0]);
        }

        for (int i = 1; i < max; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }

            if (prime) {
                System.out.print(i + "、");
            }
        }
    }

}


/**
 * Project Name:Thinking In Java File Name:FindPrimes2.java Package Name:chapter04
 * Date:2018年12月6日下午4:50:31 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:FindPrimes2 <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月6日 下午4:50:31 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class FindPrimes2 {

    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 3000; i++) {
            findPrimes(args);
        }
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1;
        System.out.println();
        System.out.println("------------time1:" + time1);
        
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 3000; i++) {
            findPrimes2(args);
        }
        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2;

        System.out.println();
        System.out.println("------------time2:" + time2);

    }

    public static void findPrimes(String[] args) {
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
                System.out.println(i + "、");
            }
        }
    }

    public static void findPrimes2(String[] args) {
        int max = 100;
        if (args.length != 0) {
            max = Integer.parseInt(args[0]);
        }

        boolean[] sieve = new boolean[max + 1];

        int limit = (int) Math.floor(Math.sqrt(max));

        System.out.print(1 + "、");

        if (max > 1) {
            System.out.print(2 + "、");
        }

        for (int i = 3; i <= limit; i += 2) {
            if (!sieve[i]) {
                for (int j = 2 * i; j <= max; j += i) {
                    sieve[j] = true;
                }
            }
        }

        for (int i = 3; i <= max; i += 2) {
            if (!sieve[i]) {
                System.out.println(i + "、");
            }
        }
    }

}


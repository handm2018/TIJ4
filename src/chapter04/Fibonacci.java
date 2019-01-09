/**
 * Project Name:Thinking In Java File Name:Fibonnaci.java Package Name:chapter04
 * Date:2018年12月7日上午10:49:20 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:Fibonnaci <br/>
 * Function: ADD FUNCTION 斐波那契数列,递归调用和数组解决. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 上午10:49:20 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Fibonacci {

    public static void fibonacci(int num) throws Exception {
        if (num <= 0) {
            throw new Exception("数字输入错误");
        }
        if (num == 1) {
            System.out.print("1");
        }
        if (num == 2) {
            System.out.print("1 1");
        }
        if (num > 2) {
            int[] nums = new int[num];
            nums[0] = 1;
            nums[1] = 1;
            System.out.print("1 1 ");
            for (int i = 2; i < num; i++) {
                nums[i] = nums[i - 1] + nums[i - 2];
                System.out.print(nums[i] + " ");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        fibonacci(20);
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}


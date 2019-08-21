package chapter18;

/**
 * @author : handongming
 * @date : Created in 2019/8/21 16:35
 * @description: 递归算法1
 * @modified By:
 * @version:
 */
public class Recursion01 {

    /**
     * 演示：递归求阶乘
     * 普及数学知识：
     * 算法1：5! = 5 * 4 * 3 * 2 * 1 = 120
     * 算法2：5! = 5 * 4!
     * 4! = 4 * 3!
     * 3! = 3 * 2!
     * 2! = 2 * 1!
     * 1! = 1
     * 规律：n! = n * (n-1)!
     * 结束条件：n <= 1  结果是1
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * 演示：用递归解决斐波那契数列
     * 不死神兔问题：
     * 假如有一对兔子，从第3个月开始，每个月都生1对新的兔子，以后的兔子也都是这样。如果兔子不会死，请问第n个月会有几对兔子
     * 找规律：
     * 月份(n): 1	2	3	4	5	6	7	8	9	10
     * 对数(f): 1	1	2	3	5	8	13	21	34	55
     * f(n) = f(n - 1) + f(n - 2)
     * 结束条件：
     * n < 3 ：f = 1
     */
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(9));
    }


}

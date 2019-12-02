package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: <br>
 * @Project: ThinkingInJava<br>
 * @CreateDate: Created in 2019/7/9 0009 22:45 <br>
 * @Author: <a href="handm2018@126.com"></a>
 */
public class E04_Fibonacci2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 1; i <6; i++) {
            exec.execute(new Fibonacci(i));
        }
        Thread.yield();
        exec.shutdown();

        exec = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 5; i++) {
            exec.execute(new Fibonacci(i));
        }
        Thread.yield();
        exec.shutdown();

        exec = Executors.newSingleThreadExecutor();
        for (int i = 1; i < 5; i++) {
            exec.execute(new Fibonacci(i));
        }
        Thread.yield();
        exec.shutdown();
    }
}

package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: <br>
 * @Project: ThinkingInJava<br>
 * @CreateDate: Created in 2019/7/9 0009 22:15 <br>
 * @Author: <a href="handm2018@126.com"></a>
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        // 单个线程
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new ListOff());
        }
        executorService.shutdown();
    }
}

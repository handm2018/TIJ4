package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/7/9 0009 22:01 <br>
 * @Author: <a href="handm2018@126.com">abc</a>
 */
public class CacheThreadPool {
    public static void main(String[] args) {
        // 为每一个任务都创建一个线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new ListOff());
        }
        executorService.shutdown();
    }
}

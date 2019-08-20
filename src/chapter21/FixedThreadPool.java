package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: <br>
 * @Project: ThinkingInJava<br>
 * @CreateDate: Created in 2019/7/9 0009 22:09 <br>
 * @Author: <a href="handm2018@126.com"></a>
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        // 预先执行线程分配，创建指定数量的线程，线程得到复用
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 6; i++) {
            executorService.execute(new ListOff());
        }
        executorService.shutdown();
    }
}

package chapter21;

/**
 * 将一个Runnable实例转换为任务的有效方式是将他提交给一个Thread构造器
 *
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new ListOff());
        t.start();
        System.out.println("Waiting for ListOff!");
    }
}

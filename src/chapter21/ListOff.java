package chapter21;

/**
 * 创建任务
 *   ·id，用来区分各个任务实例，是final的，因为它被创建后就不希望被更改
 *   ·Thread.yield(); 线程调度器，将cpu从一个线程调度到另一个线程，这个只是建议，并不一定会执行
 *   ·Runnable类不会产生内在的线程能力，要实现线程能力，必须将他显示的附着在线程上。
 */
public class ListOff implements  Runnable {

    //默认数量
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public ListOff(){}
    public ListOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#"+id+"("+(countDown>0?countDown:"ListOff!")+"),";
    }

    @Override
    public void run() {
        while (countDown-->0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}

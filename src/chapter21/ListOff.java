package chapter21;

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

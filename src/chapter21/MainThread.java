package chapter21;

/**
 *  ·Runnable类不会产生内在的线程能力，它只是一个具有run()方法的类
 *  ·要实现线程能力，必须将他显示的附着在线程上。
 */
public class MainThread {

    public static void main(String[] args) {
        ListOff launch = new ListOff();
        launch.run();
    }
}

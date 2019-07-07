package chapter21;

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new ListOff());
        t.start();
        System.out.println("Waiting for ListOff!");
    }
}

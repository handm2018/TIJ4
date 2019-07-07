package chapter21;

/**
 *@Description: 
 *@Param: 
 *@return: 
 *@Author: handongming
 *@date: 19-7-7
 */
public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            new Thread(new ListOff()).start();
            System.out.println("Waiting for ListOff!");
        }
    }
}

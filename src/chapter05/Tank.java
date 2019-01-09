/**
 * Project Name:Thinking In Java File Name:Tank.java Package Name:chapter05
 * Date:2018年12月11日下午5:32:32 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:Tank <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年12月11日 下午5:32:32 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Tank {
    static int count;
    int id = count++;
    boolean full;

    public Tank() {
        System.out.println("Tank" + id + "  created");
        full = true;
    }

    public void cleanUp() {
        full = false;
    }

    @Override
    protected void finalize() throws Throwable {

        if (full) {
            System.out.println("ERROR : Tank" + id + " must be cleaned up");
        } else {
            System.out.println("SUCCESS : Tank" + id + " is empty");
        }
    }

    public static void main(String[] args) {
        new Tank().cleanUp();
        new Tank();
        System.gc();
        System.runFinalization();
    }

}


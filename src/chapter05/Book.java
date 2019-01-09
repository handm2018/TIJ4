/**
 * Project Name:Thinking In Java File Name:Book.java Package Name:chapter05
 * Date:2018年12月10日下午2:50:07 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:Book <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月10日 下午2:50:07 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {

        if (checkedOut) {
            System.out.println("Error : checkedout");
        }
        // super.finalize();
    }
}


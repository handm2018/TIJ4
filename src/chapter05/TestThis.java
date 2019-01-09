/**
 * Project Name:Thinking In Java File Name:TestThis.java Package Name:chapter05
 * Date:2018年12月7日下午5:54:34 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:TestThis <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 下午5:54:34 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class TestThis {
    public static void main(String[] args) {
        TestThis tt = new TestThis();
        tt.invoke();
    }

    void invoke() {
        print();
        this.print();
    }

    void print() {
        System.out.println("---111----");
    }
}


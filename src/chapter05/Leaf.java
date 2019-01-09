/**
 * Project Name:Thinking In Java File Name:Leaf.java Package Name:chapter05 Date:2018年12月7日下午4:16:27
 * Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:Leaf <br/>
 * Function: this的应用，return this；返回当前对象的引用，因此就可以很方便的在一条语句里多次操作同一个对象。 ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 下午4:16:27 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Leaf {

    int i = 1;

    Leaf increment() {
        i++;
        return this;
    }
    
    void print(){
        System.out.println("i = "+i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }

}


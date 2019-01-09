/**
 * Project Name:Thinking In Java File Name:PassThis.java Package Name:chapter05
 * Date:2018年12月7日下午4:59:18 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:PassThis <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 下午4:59:18 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class PassThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}


class Person {
    public void eat(Apple apple){
        apple.getPeeled();
        System.out.println("so .... ");
    }
}


class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}


class Peeler {
    static Apple peel(Apple apple) {
        // doing something
        return apple; // peeled
    }
}



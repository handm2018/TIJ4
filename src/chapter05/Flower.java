/**
 * Project Name:Thinking In Java File Name:Flower.java Package Name:chapter05
 * Date:2018年12月10日上午9:31:29 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter05;

/**
 * ClassName:Flower <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月10日 上午9:31:29 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Flower {
    int petalCount = 0;
    String s = "initail value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("constructor int petals,petalCont = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("constructor string ss = " + s);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        // this(s); //Constructor call must be the first statement in a constructor,must be only one
        this.s = s;
        System.out.println("String && int constructor");
    }

    Flower() {
        this("hello", 9);
        System.out.println("default constructor");
    }

    void printPetals() {
        //this(12);   //must be in constructor;
        System.out.println("petalCount = " + petalCount + ";s = " + s);
    }
    
    
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetals();
    }

}


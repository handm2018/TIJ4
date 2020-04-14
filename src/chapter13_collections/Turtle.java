package chapter13_collections;

import java.util.Formatter;

/**
 * @author ：handongming
 * @date ：Created in 2019/8/9 13:45
 * @description：Format,格式化String
 * @modified By：
 * @version: 1.0$
 */
public class Turtle {

    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y){
        formatter.format("%s the turtle is at (%d,%d)\n",name,x,y);
    }

    public static void main(String[] args) {

    }
}

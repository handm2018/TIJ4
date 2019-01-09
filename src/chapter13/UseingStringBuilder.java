package chapter13;

import java.util.Random;

/**
 * ClassName: UseingStringBuilder <br/>
 * Function: ADD FUNCTION. <br/>
 * Reason: ADD REASON(可选). <br/>
 * date: 2018年12月5日 上午9:49:49 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 */
public class UseingStringBuilder {

    public static Random rand = new Random(47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UseingStringBuilder sb = new UseingStringBuilder();
        System.out.println(sb);
    }

}

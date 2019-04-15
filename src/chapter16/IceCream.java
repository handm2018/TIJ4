package chapter16;

import java.util.Arrays;
import java.util.Random;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName IceCream.java
 * @Description TODO
 * @createTime 2019年04月15日 15:25:00
 */
public class IceCream {

    private static final Random random = new Random(47);
    private static final String[] FLAVORS = {
        "巧克力", "草莓", "香草", "抹茶", "芒果", "芝士", "鲜奶油", "橡皮糖"
    };

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(favorsSet(4)));
        }
    }

    public static String[] favorsSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("set too big");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            } while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;
    }
}

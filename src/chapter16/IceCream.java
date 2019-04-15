package chapter16;

import java.util.Arrays;
import java.util.Random;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName IceCream.java
 * @Description 返回数组
 * @createTime 2019年04月15日 15:25:00
 */
public class IceCream {

    private static final Random random = new Random(47);
    private static final String[] FLAVORS = {
        "巧克力", "草莓", "香草", "抹茶", "芒果", "芝士", "鲜奶油", "橡皮糖"
    };

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(favorsSet(6)));
        }
    }

    public static String[] favorsSet(int n) {

        // 保证数组中的口味不会重复
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("set too big");
        }

        String[] results = new String[n];
        // 该位置的口味是否已被选择
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            //临时变量t，随机选择口味
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            } while (picked[t]); //若该口味已被选择，重新选择
            //将随机选择的口味放到数组中
            results[i] = FLAVORS[t];
            //将选择的此口味标记为已选择
            picked[t] = true;
        }
        return results;
    }
}

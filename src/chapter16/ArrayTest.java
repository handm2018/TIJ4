package chapter16;

import java.util.Scanner;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName ArrayTest.java
 * @Description 在一个货架上有 5 件商品，编写程序，在输入商品价格之后输出最高价格、总价格和平均价格
 * @createTime 2019年05月21日 14:47:00
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] price = new int[5];
        Scanner scanner = new Scanner(System.in);
        int maxPrice = 0;
        int sumPrice = 0;
        int len = price.length;
        for (int i = 0; i <len; i++) {
            System.out.println("请输入第"+(i+1)+"件商品的价格：");
            price[i] = scanner.nextInt();
        }
        for (int i = 0; i <len; i++) {
            sumPrice += price[i];
            if (price[i]>maxPrice){
                maxPrice = price[i];
            }
        }
        int avgPrice = sumPrice/len;
        System.out.println("最高价格"+maxPrice);
        System.out.println("总价格"+sumPrice);
        System.out.println("平均价格"+avgPrice);
    }

}

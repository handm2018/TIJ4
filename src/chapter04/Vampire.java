/**
 * Project Name:Thinking In Java File Name:Vampire.java Package Name:chapter04
 * Date:2018年12月7日下午2:43:42 Copyright (c) 2018, handm2018@126.com All Rights Reserved.
 * 
 */

package chapter04;

/**
 * ClassName:Vampire <br/>
 * Function: 吸血鬼数字 ADD FUNCTION. <br/>
 * Reason: ADD REASON. <br/>
 * Date: 2018年12月7日 下午2:43:42 <br/>
 * 
 * @author handm
 * @version
 * @since JDK 1.6
 * @see
 */
public class Vampire {
    public static void main(String[] args) {
        vampire();
    }

    public static void vampire() {
        for (int i = 1000; i < 10000; i++) {
            for (int j = 10; j < 51; j++) {
                if(i%j==0){
                    int m = i/j;
                    if(m>=10&&m<100){
                        int mend = m%10;
                        int jend = j%10;
                        if(mend!=0&&jend!=0){
                            System.out.println(i+" = "+j+" * "+ m);
                        }
                    }
                    
                }
            }
        }
    }
}


package test;

import java.util.Arrays;

/**
 * @author handm2018@126.com
 * @version 1.0.0
 * @ClassName Solution.java
 * @Description TODO
 * @createTime 2019年05月14日 14:26:00
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,12,35,18};
        int[] result =  twoSum(nums,37);
        System.out.println(Arrays.toString(result));

        try{
            int i = Integer.valueOf("jkl");
        }
        catch (Exception e){
            System.out.println("cuowu.........");
        }
        System.out.println("lajfoqoifj.........");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

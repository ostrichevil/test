package demo.leetCode;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author li
 * @date 20180305
 * @des 数组中求两个数的值等于目标值
 * 思路：   1.两层循环遍历
 * 2.用map O(nlongn)
 * 3.用数组代替map(节省时间，消耗空间)
 */
public class Code_001 {

    /**
     * 1
     */
    public static int[] twoSumSolutionOne(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 2
     */
    public static int[] twoSumSolutionTwo(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer n = map.get(nums[i]);
            if (n == null) {
                map.put(nums[i], i);
            }
            n = map.get(target - nums[i]);
            if (n != null && n < i) {
                return new int[]{n, i};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(twoSumSolutionOne(arr, 11)));
        System.out.println(Arrays.toString(twoSumSolutionTwo(arr, 11)));
    }
}

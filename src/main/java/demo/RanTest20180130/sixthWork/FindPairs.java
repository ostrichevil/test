package demo.RanTest20180130.sixthWork;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizheng
 * @date 2018/3/22
 * @des 在数组中找出差值绝对值等于k的序列对
 */
public class FindPairs {

    public static int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(k + nums[j]) && map.get(nums[j] + k) != j) {
                count++;
                map.remove(nums[j]+k);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1, 3, 1, 5, 4};
        System.out.println(findPairs(nums,0));
    }

}

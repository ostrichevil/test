package achievement.partOne;

/**
 * @author lizheng
 * @date 2018/5/10
 * @des 删除有序数组中重复项 并返回最后数组长度
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int len = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                len--;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}

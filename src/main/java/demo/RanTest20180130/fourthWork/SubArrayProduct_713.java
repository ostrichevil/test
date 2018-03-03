package demo.RanTest20180130.fourthWork;


/**
 * @author li
 * @date 20180228
 * @des 一个数组，一个k值，找出数组内所有连续子集的积小于k的个数
 * Input: nums = [10, 5, 2, 6], k = 100
 * Output: 8
 *       疑惑：每次头尾移动算个数 end-start+1？
 *       手演了一遍  对于框的每次移动，相当于要加上是新加入的子数组的个数 比如框内两个元素（end=2，start=1，新加入的就是第二个元素和两个元素组成的数组），以此类推
 *       这个方法主要得益于 找连续的子集
 */
public class SubArrayProduct_713 {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, start = 0, product = 1;
        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];
            while (start <= end && product >= k) {
                product /= nums[start];
                start++;
            }
            count += end - start + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }
}

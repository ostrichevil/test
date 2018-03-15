package demo.leetCode;


import java.util.HashMap;
import java.util.Map;

/**
 * @author li
 * @date 20180315
 * @des 找到字符串s中不包含相同元素的最大子串长度
 *      思路：i和j两个下标，如果map中有重复的值，更新j值（左边）,i为右边
 */
public class Code_002 {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int j=0;
        int max=0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcaefghj"));
    }
}

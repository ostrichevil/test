package demo.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizheng
 * @date 2018/3/26
 * @des 字符串s中找最大的回文字串
 */
public class Code_004 {

    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return null;
        }
        int first = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                first = map.get(s.charAt(i));
                max = Math.max(max, i - first);
            }
            map.put(s.charAt(i), i);
        }
        return s.substring(first, first + max + 1);
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

}

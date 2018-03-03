package demo.RanTest20180130.fourthWork;


import java.util.Stack;

/**
 * @author lizheng
 * @date 20180227
 * @des s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 * 思路： 两个栈 先遍历字符串，一个栈记录数字，另一个栈记录[]中内容 主要是四个分支 数字，左框，右框和其他
 * 数字入数字栈 左框入不需重复的字符串 右框弹出拼接需要重复的 其他录入不需要重复的字符串
 */
public class DecodeString_394 {


    public static String decodeString(String s) {
        String content = "";
        Stack<Integer> stackNumber = new Stack<Integer>();
        Stack<String> stackContent = new Stack<String>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                stackNumber.push(count);
            } else if (s.charAt(idx) == '[') {
                stackContent.push(content);
                content = "";
                idx++;
            } else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder(stackContent.pop());
                int repeatTimes = stackNumber.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(content);
                }
                content = temp.toString();
                idx++;
            } else {
                content += s.charAt(idx++);
            }
        }
        return content;
    }

    public static void main(String[] args) {
        String s = "aaa20[abc]3[cd]ef";
        System.out.println(decodeString(s));

    }
}

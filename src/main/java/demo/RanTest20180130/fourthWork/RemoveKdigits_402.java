package demo.RanTest20180130.fourthWork;


import java.util.Stack;

/**
 * @author li
 * @date 20180302
 * @des 字符串num，去除k位，得最小的数
 * 思路： 1.将字符串中的数字入栈，如果入栈的数字比栈顶的数字小，则弹栈入该数字
 * 2.k如果还大于0，那就是栈中的长度还是大，弹出栈顶元素，直到k=0
 * 3.将栈中的元素弹出构造成字符串
 * 4.找出字符串第一个不为0的下标，截取
 * 5.判断最后的字符串为空串的话返回 0
 */
public class RemoveKdigits_402 {

    public static String removeKdigits(String num, int k) {
        StringBuffer result = new StringBuffer();
        Stack<Character> stack = new Stack<Character>();
        char[] chars = num.toCharArray();
        char a;
        /**
         * 1
         * */
        for (int i = 0; i < chars.length; i++) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > chars[i]) {
                k--;
                stack.pop();
            }
            stack.push(chars[i]);
        }
        /**
         * 2
         * */
        while (k > 0 && !stack.isEmpty()) {
            k--;
            stack.pop();
        }
        /**
         * 3
         * */
        while (!stack.isEmpty()) {
            result.insert(0, stack.peek());
            stack.pop();
        }
        /**
         * 4
         * */
        int index = 0;
        while (result.length() > 0 && result.charAt(index) == '0') {
            index++;
        }
        result = new StringBuffer(result.substring(index));
        /**
         * 5
         * */
        if (result.length() == 0) {
            result = new StringBuffer("0");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String num = "10";
        System.out.println(removeKdigits(num, 2));
    }
}

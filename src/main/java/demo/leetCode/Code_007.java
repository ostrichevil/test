package demo.leetCode;

/**
 * @author lizheng
 * @date 2018/3/29
 * @des 整数逆转 末尾为0省略 负数去除符号逆转
 */
public class Code_007 {
    public static int reverse(int x) {
        String xToString = String.valueOf(Math.abs(x));
        char[] chars = new char[xToString.length()];
        for (int i = 0; i < xToString.length(); i++) {
            chars[i] = xToString.charAt(xToString.length() - 1 - i);
        }
        String reverseStr = String.valueOf(chars);
        if (x < 0) {
            return 0 - Integer.parseInt(String.valueOf(chars));
        } else {
            return Integer.parseInt(String.valueOf(chars));
        }
    }

    public static int reverseOther(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = result * 10 + tail;
            result = newRes;
            x = x / 10;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverseOther(0));
    }

}

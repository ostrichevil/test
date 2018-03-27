package demo.leetCode;

/**
 * @author lizheng
 * @date 2018/3/27
 * @des  思路：外层循环控制行数，内层循环控制列
 *            拆分单位来看 竖着的为numRows-1，斜着的个数也为numRows-1，所以列的间隔为 2*（numRows-1）
 *            从第i行第j列找同行的下一个元素 j+2*(numRows-1-i)
 */
public class Code_006 {

    public static String convert(String s, int numRows) {
        if (s.length() <= numRows) {
            return s;
        }
        int size = 2 * numRows - 2;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += size) {
                stringBuffer.append(s.charAt(j));
                int temp = j + size - 2 * i;
                if (i != 0 && i != numRows - 1 && temp < s.length()) {
                    stringBuffer.append(s.charAt(temp));
                }
            }

        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}

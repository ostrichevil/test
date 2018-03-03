package demo.ArrayTest;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lizheng
 */
public class ArrayTest {


    /**
     * 寻找数组最大子段和
     */
    public static int findMaxPeriod(int arr[]) {
        int curnum = 0;
        int maxnum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (curnum + arr[i] < 0) {
                curnum = 0;
            } else {
                curnum += arr[i];
                maxnum = Math.max(maxnum, curnum);
            }
        }
        return maxnum;
    }

    /**
     * 数组逆序
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }

    /**
     * 数组右移n位  将前半段逆序，再将后半段逆序，最后整体逆序
     */
    public static void moveArr(int[] arr, int n) {
        n %= arr.length;
        reverse(arr, 0, arr.length - n - 1);
        reverse(arr, arr.length - n, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    /**
     * 求数组中给定和的数对
     */
    public static void findPairOfNum(int[] arr, int n) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == n) {
                System.out.println(i + " " + j);
                i++;
                j--;
            } else if (arr[i] + arr[j] < n) {
                i++;
            } else {
                j--;
            }

        }
    }

    /**
     * 找出出现奇数次的元素
     */
    public static int findOddNumber(int arr[]) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a ^= arr[i];
        }
        return a;
    }


    /**
     * 有序数组寻找arr和brr中相同的元素
     */
    public static void findComm(int[] arr, int[] brr, int n) {
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] < brr[j]) {
                i++;
            } else if (arr[i] == brr[j]) {
                System.out.println(arr[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void findMaxAndMin(int[] arr) {

    }

    /**
     * 求最大和第二大
     */
    public static void findMaxAndLessmax(int[] arr) {
        int max = arr[0];
        int lessMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                lessMax = max;
                max = arr[i];
            } else {
                if (lessMax < arr[i]) {
                    lessMax = arr[i];
                }
            }
        }
        System.out.println("max:" + max + " lessMax:" + lessMax);
    }


    /**
     * 数组求和
     */
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int sumArrayOther(int[] arr, int n) {
        return n == 0 ? 0 : sumArrayOther(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        /**
         * 声明数组
         * */
        String[] arrFirst = new String[5];
        String[] arrSecond = {"a", "b", "c", "d", "e"};
        String[] arrThird = new String[]{"a", "b", "c", "d", "e"};

        /**
         * 输出数组
         * */
        String outArray = Arrays.toString(arrSecond);
        System.out.println(outArray);

        /**
         * 数组生成数组链表
         * */
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arrSecond));
        System.out.println(arrayList);

        /**
         * 检查一个数组是否含有某值
         * */
        boolean a = Arrays.asList(arrSecond).contains("c");
        System.out.println(a);

        int[] numArray = {1, 2, 3, 4, 5};
        int[] numArrayB = {2, 6, 8, 3, 7};
        int[] numArrayC = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(sumArrayOther(numArray, 5));
        System.out.println(sumArray(numArray));
        findMaxAndLessmax(numArray);
        findComm(numArray, numArrayB, 4);
        System.out.println(findOddNumber(numArrayC));
        findPairOfNum(numArray, 5);

        moveArr(numArray, 2);
        String out = Arrays.toString(numArray);
        System.out.println(out);

        System.out.println(findMaxPeriod(numArray));

    }


}

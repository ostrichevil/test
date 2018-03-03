package demo.MultiSort;

import java.util.Arrays;


/**
 * @author li
 * @description 两层循环，找到合适的位置插入 外层循环控制排序元素，内层循环控制插入
 */
public class InsertSort {

    public static void insertSort(int[] arr) {
        int j, target;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            target = arr[i];
            for (; j > 0 && target < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
//            while(j>0&&target<arr[j-1])
//            {
//                arr[j]=arr[j-1];
//                j--;
//            }
            arr[j] = target;
        }

    }

    public static void insertSort2(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i;
//            for (; j > 0 && target < arr[j - 1]; j--) {
//                arr[j] = arr[j - 1];
//            }
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 7, 2, 1, 9, 1};
        insertSort2(a);
        System.out.println(Arrays.toString(a));



    }

}

package demo.MultiSort;


import java.util.Arrays;

/**
 * @author li
 * @description 遍历n-1次，每次找出最小的值，和当前比较开始交换位置
 */
public class SelectSort {

    public int findSmallest(int[] arr, int i) {
        int a = arr[i];
        int index = i;
        for (; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
                index = i;
            }
        }
        return index;

    }


    public void SelectSort(int[] arr) {
        int b = 0;
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            int a = findSmallest(arr, i);
            b = arr[a];
            arr[a] = arr[i];
            arr[i] = b;
        }

    }

    /**
     * 选择排序
     */
    public void selectSort(int[] arr) {
        int tmp = 0, index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }



    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int a[] = {4, 2, 6, 8, 1, 1, 4, 31, 123, 12, 0, 23, 1, 1};
        selectSort.selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}

package demo.RanTest20180130.FifthWork;


import java.util.Arrays;

/**
 * @author li
 * @date 20180312
 * @des 快速排序
 * 思路：以一个数为基准，左边放比其小的，右边放比其大的 时间复杂度 o(nlogn) 最坏情况 o(n2)
 */
public class QuickSort {

    public void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static int getIndex(int[] arr, int low, int high) {
        int value = arr[low];
        while (low < high) {
            while (arr[high] >= value && high > low) {
                high--;
            }
            arr[low] = arr[high];
            while (arr[low] <= value && high > low) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = value;
        return low;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int index = getIndex(arr, low, high);
        sort(arr, low, index - 1);
        sort(arr, index + 1, high);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {3, 4, 6, 1, 2, 0, 3};
        quickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

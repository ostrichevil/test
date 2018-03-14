package demo.RanTest20180130.FifthWork;


import java.util.Arrays;

/**
 * @author li
 * @date 20180314
 * @des 归并排序
 * 思路：分治法 先分开，排序完再合并
 */
public class MergeSort {

    public void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }


    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[a.length];
        int i = low, j = mid + 1;
        int m = mid, n = high;
        int k = 0;

        while (i <= m && j <= n) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= m) {
            temp[k++] = a[i++];
        }
        while (j <= n) {
            temp[k++] = a[j++];
        }
        for (i = 0; i < k; i++) {
            a[low + i] = temp[i];
        }
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        int[] arr = {1, 10, 9, 8, 9, 6, 7};
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

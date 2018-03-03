package demo.MultiSort;

import java.util.Arrays;


/**
 * @author  lizheng
 * des 冒泡排序 两层循环，外层循环控制次数，内层循环控制每次排序多少次
 * */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean flag = true;
        int b = 0;
        int a = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    b = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = b;
                    flag = true;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        int a = 0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if (arr[j] < arr[j+1]) {
                    a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
    }

    /**
     * 还不知道这是哪个排序
     * */
    public static void bubbleSort3(int[] arr) {
        int a=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j]=a;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 6, 3, 1, 0};
        bubbleSort2(a);
        System.out.println(Arrays.toString(a));
    }

}

package demo.RanTest20180130.FifthWork;


/**
 * @author li
 * @date 20180311
 * @des 二分查找 看数组中是否包含那个数(arr数组顺序)
 * 思路：1.循环
 * 2.递归
 */
public class BinarySearch {


    public boolean contains(int[] arr, int value) {
        int index = 0;
        if (arr.length > 0) {
            index = binarySearchRecursion(arr, value, 0, arr.length - 1);
        }
        if (index >= 0 && index <= arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 循环实现
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            }
        }
        return Integer.MIN_VALUE;
    }


    /**
     * 递归实现
     */
    public static int binarySearchRecursion(int[] arr, int value, int low, int high) {
        if (low > high) {
            return Integer.MIN_VALUE;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return binarySearchRecursion(arr, value, low, mid - 1);
        } else if (arr[mid] < value) {
            return binarySearchRecursion(arr, value, mid + 1, high);
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 9,};
        System.out.println(binarySearch(arr, 7, 0, arr.length - 1));
        System.out.println(binarySearchRecursion(arr, 7, 0, arr.length - 1));
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.contains(arr, 3));
    }
}

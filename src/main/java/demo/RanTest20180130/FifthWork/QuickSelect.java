package demo.RanTest20180130.FifthWork;


/**
 * @author li
 * @date 20180313
 * @des 思路：利用了快排思路
 * 如果rank大于第一次分区值，那么第rank大的值一定在右半部
 * 如果rank小于第一次分区值，那么第rank大的值一定在左半部（以此递归）
 * 第rank大即 index-low+1=rank
 */
public class QuickSelect {

    public int getAtRank(int[] arr, int rank) {
        return quickSelect2(arr, rank, 0, arr.length - 1);
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

    public static int quickSelect(int[] arr, int rank, int low, int high) {
        int index = getIndex(arr, low, high);
        if (index - low + 1 == rank) {
            return arr[index];
        } else if (index - low + 1 > rank) {
            return quickSelect(arr, rank, low, index - 1);
        } else {
            return quickSelect(arr, rank - index + low - 1, index + 1, high);
        }
    }

    public static int quickSelect2(int[] arr, int rank, int low, int high) {
        int index = getIndex(arr, low, high);
        if (high - index + 1 == rank) {
            return arr[index];
        } else if (high - index + 1 > rank) {
            return quickSelect(arr, high - index + 1 - rank, index + 1, high);
        } else {
            return quickSelect(arr, 2 * index - low - high + rank, low, index - 1);
        }
    }

    public static void main(String[] args) {
        QuickSelect quickSelect = new QuickSelect();
        int[] arr = {1, 5, 3, 9, 7, 4, 2};
        System.out.println(quickSelect.getAtRank(arr, 3));
    }
}

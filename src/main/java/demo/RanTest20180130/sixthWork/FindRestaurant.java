package demo.RanTest20180130.sixthWork;

import java.util.*;

/**
 * @author lizheng
 * @date 2018/3/23
 * @des
 */
public class FindRestaurant {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> maplist1 = new HashMap<String, Integer>();
        List<String> list = new LinkedList<String>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            maplist1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            Integer index = maplist1.get(list2[i]);
            if (index != null && i + index < minSum) {
                list.clear();
                minSum = i + index;
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] a = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] b = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(a, b)));
    }
}

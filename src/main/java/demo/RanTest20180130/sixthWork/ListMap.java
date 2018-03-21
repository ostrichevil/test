package demo.RanTest20180130.sixthWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizheng
 * @date 2018/3/21
 * @des
 */
public class ListMap implements ListMapInterface {

    private Map<String, List<Integer>> listMap = new HashMap<String, List<Integer>>();

    @Override
    public void add(String key, Integer value) {
        List<Integer> list = new ArrayList<Integer>();
        if (listMap.containsKey(key)) {
            list = listMap.get(key);
            list.add(value);
        } else {
            list.add(value);
            listMap.put(key, list);
        }
    }

    @Override
    public List<Integer> get(String key) {

        return listMap.get(key);
    }

    @Override
    public void removeFirst(String key, Integer value) {
        if (listMap.containsKey(key)) {
            List<Integer> list = listMap.get(key);
            if (list.size() == 1) {
                listMap.remove(key);
                listMap.put(key, null);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(value)) {
                        list.remove(i);
                        break;
                    }
                }
            }
        } else {
            System.out.println("listMap中不包含" + key);
        }
    }

    @Override
    public void removeLast(String key, Integer value) {
        if (listMap.containsKey(key)) {
            List<Integer> list = listMap.get(key);
            if (list.size() == 1) {
                listMap.remove(key);
                listMap.put(key, null);
            } else {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i).equals(value)) {
                        list.remove(i);
                        break;
                    }
                }
            }
        } else {
            System.out.println("listMap中不包含" + key);
        }
    }

    @Override
    public void removeAll(String key, Integer value) {
        if (listMap.containsKey(key)) {
            List<Integer> list = listMap.get(key);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(value)) {
                    list.remove(value);
                }
            }
        } else {
            System.out.println("listMap中不包含" + key);
        }
    }

    @Override
    public void remove(String key) {
        if (listMap.containsKey(key)) {
            listMap.remove(key);
        } else {
            System.out.println("listMap中不包含" + key);
        }
    }

    @Override
    public boolean containsKey(String key) {
        if (listMap.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ListMap listMap = new ListMap();
        listMap.add("A", 1);
        listMap.add("A", 2);
        listMap.add("A", 1);
        System.out.println(listMap.get("A"));
//        listMap.removeFirst("A", 1);
//        listMap.removeFirst("A", 2);
        // listMap.removeLast("A", 1);
        listMap.removeAll("A", 1);
        System.out.println(listMap.get("A"));
    }
}

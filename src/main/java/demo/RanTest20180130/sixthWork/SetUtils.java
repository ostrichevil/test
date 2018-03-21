package demo.RanTest20180130.sixthWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lizheng
 * @date 2018/3/21
 * @des set的工具包，三个方法 集合求交集，求并集，相减(集合中没有重复的元素)
 */
public class SetUtils {

    public static Set<String> union(Set<String> s1, Set<String> s2) {
        Set<String> unionSet = new HashSet<String>();
//        for (String s : s1) {
//            unionSet.add(s);
//        }
//        for (String s : s2) {
//            unionSet.add(s);
//        }
        unionSet.addAll(s1);
        unionSet.addAll(s2);
        return unionSet;
    }

    public static Set<String> intersect(Set<String> s1, Set<String> s2) {
        Set<String> intersectSet = new HashSet<String>();
//        for (String s : s1) {
//            if (s2.contains(s)) {
//                intersectSet.add(s);
//            }
//        }
        intersectSet.addAll(s1);
        intersectSet.retainAll(s2);
        return intersectSet;
    }

    public static Set<String> subtract(Set<String> s1, Set<String> s2) {
        Set<String> subtractSet = new HashSet<String>();
//        for (String s : s1) {
//            if (!s2.contains(s)) {
//                subtractSet.add(s);
//            }
//        }
        subtractSet.addAll(s1);
        subtractSet.removeAll(s2);
        return subtractSet;
    }


    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.add("1");
        set1.add("2");
        set2.add("1");
        set2.add("3");
        System.out.println(Arrays.toString(union(set1, set2).toArray()));
        System.out.println(Arrays.toString(intersect(set1, set2).toArray()));
        System.out.println(Arrays.toString(subtract(set1, set2).toArray()));

    }

}

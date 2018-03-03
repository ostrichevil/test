package demo.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("abc");
        set.add("b");
        set.add("c");
        String str="ab";
        if (set.contains(str)) {
            int a=1;
        }
    }
}

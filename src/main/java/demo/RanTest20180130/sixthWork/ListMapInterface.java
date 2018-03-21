package demo.RanTest20180130.sixthWork;

import java.util.List;

/**
 * @author lizheng
 * @date 2018/3/21
 * @des
 */
public interface ListMapInterface {
    void add(String key, Integer value);

    List<Integer> get(String key);

    void removeFirst(String key, Integer value);

    void removeLast(String key, Integer value);

    void removeAll(String key, Integer value);

    void remove(String key);

    boolean containsKey(String key);
}

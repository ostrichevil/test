package demo.RanTest20180130.fourthWork;


/**
 * @author li
 * @date 20180302
 * @des 给定N和K，N代表行数，K代表索引 0用01替换，1用10替换
 * 0
 * 01
 * 0110 依此类推
 * 思路：0对应下一行是 01，一个数对应下一个行有两个数，所以对应那两个数要找到上一行对应哪个比如第五和第六个对应上一行就是第三个数
 *      即 N行第K个数，需要找到N-1行 (K+1)/2那个数
 *      如果K是奇数就是原数字，K是偶数就是取反
 */
public class KthGrammar {


    public static int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        return (K % 2 == 0) ? 1 - kthGrammar((N - 1), (K + 1) / 2) : kthGrammar((N - 1), (K + 1) / 2);
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(4,5));
    }
}

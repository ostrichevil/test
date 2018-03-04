package demo.RanTest20180130.fourthWork;


/**
 * @author li
 * @date 20180304
 * @des 交易，以prices数组中的价格做交易，每次交易需要手续费fee，求最大收益
 * 思路：动态规划，这个交易主要涉及的动作就是买入和卖出，定义两个动态规划数组 sold和hold
 * sold[i]保存的是第i天出售股票之后最大的利润 hold[i] 第i天持有的股票的最大利润
 * sold[i]包含两个状态，一个是第i天售出的利润，还有一个是前一天即sold[i-1]的售出利润，两者取大者 sold[i]=Max(sold[i-1],hold[i-1]+price[i]-fee)
 * hold[i]也包含两个状态，一个是第i天持有的利润，还有一个是前一天的持有利润，两者取大者  hold[i]=Max(hold[i-1],sold[i-1]-price[i])
 */
public class TransactionFee_714 {

    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int sold = 0;
        int hold = -prices[0];
        for (int i = 1; i < n; i++) {
            int soldpre = sold;
            sold = Math.max(soldpre, hold + prices[i] - fee);
            hold = Math.max(hold, soldpre - prices[i]);
        }
        return sold;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 4, 9};
        System.out.println(maxProfit(arr, 2));
    }
}

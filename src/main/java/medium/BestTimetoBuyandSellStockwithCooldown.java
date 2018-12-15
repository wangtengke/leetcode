package medium;

/**
 * @program: leetcode
 * @description:
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 *
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * Example:
 *
 * Input: [1,2,3,0,2]
 * Output: 3
 * Explanation: transactions = [buy, sell, cooldown, buy, sell]
 * @author: wangtengke
 * @create: 2018-12-15
 **/
//todo dp理解
public class BestTimetoBuyandSellStockwithCooldown {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i <prices.length-1 ; i++) {
           if(Math.max(0,prices[i+1]-prices[i])!=0){
               result +=prices[i+1]-prices[i];
           }
           else {
               i=i+2;
           }

        }
        return result;
    }

}

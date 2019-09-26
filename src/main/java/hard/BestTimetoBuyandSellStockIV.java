package hard;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-28
 **/
public class BestTimetoBuyandSellStockIV {
    public int maxProfit(int k, int[] prices) {
        if(k==0) return 0;
        Queue<Integer> q = new PriorityQueue<>((a,b)->(b-a));
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1]) s.push(prices[i]);

            else if(!s.isEmpty()){

                int sell = prices[i];
                while(s.size()>1){
                    s.pop();
                }
                int buy = s.pop();
                q.add(sell-buy);
            }
        }
        if(s.size()!=0){
            int sell = prices[prices.length-1];
            while(s.size()>1){
                s.pop();
            }
            int buy = s.pop();
            q.add(sell-buy);
        }
        int sum = 0;
        while(!q.isEmpty()) sum += q.poll();
        return sum;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStockIV bestTimetoBuyandSellStockIV = new BestTimetoBuyandSellStockIV();
        bestTimetoBuyandSellStockIV.maxProfit(2, new int[]{3,3,5,0,0,3,1,4});
    }

}

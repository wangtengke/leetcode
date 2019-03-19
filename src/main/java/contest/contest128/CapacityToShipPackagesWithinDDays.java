package contest.contest128;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-17
 **/
public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int D) {
        int allWeight = 0;
        int maxWeight = 0;
        int max1 = 0;
        for (int i = 0; i < weights.length; i++) {
            allWeight += weights[i];
            if(weights[i]>max1)
                max1 = weights[i];
        }
        int avg = allWeight/D;
        int needweight = 0;
        for (int i = 0; i <weights.length ; i++) {
           needweight +=weights[i];
           if(needweight < avg){
               break;
           }
        }


        int max = Math.max(max1,needweight);
        return max;
    }
}

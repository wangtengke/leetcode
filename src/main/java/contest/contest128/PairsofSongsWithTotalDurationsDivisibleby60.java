package contest.contest128;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-17
 **/
public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <time.length ; i++) {
            if(map.containsKey(time[i]%60)){
                map.put(time[i]%60,map.get(time[i]%60)+1);
            }
            else {
                map.put(time[i] % 60, 1);
            }
        }
        int ans = 0;
        if(map.containsKey(0)&&map.get(0)>1){
            int num = map.get(0);
            int temp = 1;
            if(num==1)
                ans = ans +1;
            else {
                for (int i = num-1; i <= num; i++) {
                    temp = temp * i;
                }
                temp = temp / 2;
                ans = ans + temp;
            }
        }
        for (int i = 1; i <30 ; i++) {
            if(map.containsKey(i)&&map.containsKey(60-i)){
                int num1 = map.get(i);
                int num2 = map.get(60-i);
                ans += num1*num2;
            }
        }
        if(map.containsKey(30)&&map.get(30)>1){
            int num = map.get(30);
            int temp = 1;
            if(num==1)
                ans = ans +1;
            else {
                for (int i = num-1; i <= num; i++) {
                    temp = temp * i;
                }
                temp = temp / 2;
                ans = ans + temp;
            }
        }
        return ans;
    }
}

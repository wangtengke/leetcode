import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-08-04
 **/
public class DecreaseElementsToMakeArrayZigzag {
    public int movesToMakeZigzag(int[] nums) {
        int count = 0;
        int count1 = 0;
        for(int i=0; i<nums.length; i++) {
            if(i%2==0) {
                int min = nums[i];
                if(i-1>=0) {
                    count += nums[i]-nums[i-1]>=0? nums[i]- nums[i-1] + 1: 0;
                    min = nums[i]-nums[i-1]>=0? nums[i-1] -1 : nums[i];
                }
                if(i+1<nums.length) {
                    count += min-nums[i+1]>=0? min + nums[i+1] + 1 : 0;
                }
            }
            else{
                int min = nums[i];
                if(i-1>=0) {
                    count1 += nums[i]-nums[i-1]>=0? nums[i]- nums[i-1] + 1: 0;
                    min = nums[i]-nums[i-1]>=0? nums[i-1] -1 : nums[i];
                }
                if(i+1<nums.length) {
                    count1 += min-nums[i+1]>=0? min + nums[i+1] + 1 : 0;
                }
            }
        }
        return Math.min(count, count1);
    }

    public static void main(String[] args) {
        DecreaseElementsToMakeArrayZigzag decreaseElementsToMakeArrayZigzag = new DecreaseElementsToMakeArrayZigzag();
        decreaseElementsToMakeArrayZigzag.movesToMakeZigzag(new int[]{9,6,1,6,2});
//        ArrayList<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        list.get
    }

}

package hard;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-15
 **/
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int index =0;
        int max = 0;
        for(int i=0; i<k; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        res[0] = max;
        for(int i=k; i<n; i++){
            System.out.println("max: "+ max);
            System.out.println("index: "+ index);
            if(nums[i]>max){
                res[i-k+1] = nums[i];
                index = i;
            }
            else if(index==i-k){
                max = 0;
                for(int j= i-k+1; j<=i; j++){
                    if(nums[j]>max){
                        max = nums[j];
                        index = j;
                    }
                }
                res[i-k+1] = max;
            }
            else{
                res[i-k+1] = max;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        slidingWindowMaximum.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }

}

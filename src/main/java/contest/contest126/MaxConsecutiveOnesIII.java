package contest.contest126;

/**
 * @program: leetcode
 * @description:
 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
 *
 * Return the length of the longest (contiguous) subarray that contains only 1s.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * Output: 6
 * Explanation:
 * [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 * Example 2:
 *
 * Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
 * Output: 10
 * Explanation:
 * [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 * @author: wangtengke
 * @create: 2019-03-03
 **/
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] A, int K) {
        int res = 0;
        for(int i = 0 ;i< A.length;i++){
                int ans = is_ok(A,i,K);
                res = Math.max(ans,res);
        }
        return res;
    }

    private int is_ok(int[] A, int begin, int k) {
        int end = begin;
        while (k>-1){
            if(A[end]==0){
                k--;
            }
            end++;
        }
        return end-begin-1;
    }
}

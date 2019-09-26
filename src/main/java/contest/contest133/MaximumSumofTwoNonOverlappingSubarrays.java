package contest.contest133;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-25
 **/
public class MaximumSumofTwoNonOverlappingSubarrays {
//    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
//        return findMax(A, 0,A.length-1, L);
//
//
//    }
//    int findMax(int[] A, int begin, int end, int len){
//        int res = 0;
//        int max = 0;
//        int ans = 0;
//        for(int i=begin; i<len; i++){
//            max += A[i];
//        }
//        res = max;
//        for(int i=begin; i<end-len; i++){
//            max = max -A[begin]+A[begin+len];
//            res = Math.max(res, max);
//            ans = res + Math.max(findMax(A, 0, i, M) , findMax(A, i+len+1, A.length-1, M));
//        }
//        return ans;
//    }

}

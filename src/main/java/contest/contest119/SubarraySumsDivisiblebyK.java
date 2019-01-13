package contest.contest119;

import medium.SubarraySumEqualsK;

/**
 * @program: leetcode
 * @description:
 * Given an array A of integers, return the number of (contiguous, non-empty) subarrays that have a sum divisible by K.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [4,5,0,-2,-3,1], K = 5
 * Output: 7
 * Explanation: There are 7 subarrays with a sum divisible by K = 5:
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 30000
 * -10000 <= A[i] <= 10000
 * 2 <= K <= 10000
 * @author: wangtengke
 * @create: 2019-01-13
 **/
public class SubarraySumsDivisiblebyK {
    //思路：一次记录每加一个数后求K的模并记录余数，相同余数中间的子序列必定是被K整除，其中余数是0的数本身也能被K整除
    public int subarraysDivByK(int[] A, int K) {
        //There K mod groups 0...K-1
        //For each prefix sum that does not have remainder 0 it needs to be paired with 1 with the same remainder
        //this is so the remainders cancel out.
        int N = A.length;
        int[] modGroups = new int[K];
        int sum = 0;
        for (int i = 0; i < N; i++){
            sum += A[i];
            int group = sum % K;

            if (group < 0) group += K; //Java has negative modulus so correct it
            modGroups[group]++;
        }

        int total = 0;
        for (int x : modGroups){
            if (x > 1) total += (x*(x-1)) / 2;
        }
        //Dont forget all numbers that divide K
        return total + modGroups[0];
    }

    public static void main(String[] args) {
        SubarraySumsDivisiblebyK subarraySumEqualsK = new SubarraySumsDivisiblebyK();
        subarraySumEqualsK.subarraysDivByK(new int[]{8,9,7,8,9},8);
    }
}

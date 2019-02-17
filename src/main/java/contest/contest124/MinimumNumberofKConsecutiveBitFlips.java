package contest.contest124;

/**
 * @program: leetcode
 * @description:
 * In an array A containing only 0s and 1s, a K-bit flip consists of choosing a (contiguous) subarray of length K and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.
 *
 * Return the minimum number of K-bit flips required so that there is no 0 in the array.  If it is not possible, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [0,1,0], K = 1
 * Output: 2
 * Explanation: Flip A[0], then flip A[2].
 * Example 2:
 *
 * Input: A = [1,1,0], K = 2
 * Output: -1
 * Explanation: No matter how we flip subarrays of size 2, we can't make the array become [1,1,1].
 * Example 3:
 *
 * Input: A = [0,0,0,1,0,1,1,0], K = 3
 * Output: 3
 * Explanation:
 * Flip A[0],A[1],A[2]: A becomes [1,1,1,1,0,1,1,0]
 * Flip A[4],A[5],A[6]: A becomes [1,1,1,1,1,0,0,0]
 * Flip A[5],A[6],A[7]: A becomes [1,1,1,1,1,1,1,1]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 30000
 * 1 <= K <= A.length
 * @author: wangtengke
 * @create: 2019-02-17
 **/
public class MinimumNumberofKConsecutiveBitFlips {
    public int minKBitFlips(int[] A, int K) {
        int count = 0;
        for(int i = 0; i+K <= A.length; ++i) {
            if(A[i] == 0) {
                count++;
                flip(A, i, K);
            }
        }
        boolean valid = true;
        for(int i = 0; i < A.length; ++i) {
            if(A[i] == 0) {
                return -1;
            }
        }
        return count;
    }

    void flip(int[] a, int from, int k) {
        for(int i = from; i < from+k; ++i) {
            a[i] = 1-a[i];
        }
    }
}

package contest.contest126;

/**
 * @program: leetcode
 * @description:
 * There are N piles of stones arranged in a row.  The i-th pile has stones[i] stones.
 *
 * A move consists of merging exactly K consecutive piles into one pile, and the cost of this move is equal to the total number of stones in these K piles.
 *
 * Find the minimum cost to merge all piles of stones into one pile.  If it is impossible, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: stones = [3,2,4,1], K = 2
 * Output: 20
 * Explanation:
 * We start with [3, 2, 4, 1].
 * We merge [3, 2] for a cost of 5, and we are left with [5, 4, 1].
 * We merge [4, 1] for a cost of 5, and we are left with [5, 5].
 * We merge [5, 5] for a cost of 10, and we are left with [10].
 * The total cost was 20, and this is the minimum possible.
 * Example 2:
 *
 * Input: stones = [3,2,4,1], K = 3
 * Output: -1
 * Explanation: After any merge operation, there are 2 piles left, and we can't merge anymore.  So the task is impossible.
 * Example 3:
 *
 * Input: stones = [3,5,1,2,6], K = 3
 * Output: 25
 * Explanation:
 * We start with [3, 5, 1, 2, 6].
 * We merge [5, 1, 2] for a cost of 8, and we are left with [3, 8, 6].
 * We merge [3, 8, 6] for a cost of 17, and we are left with [17].
 * The total cost was 25, and this is the minimum possible.
 * @author: wangtengke
 * @create: 2019-03-03
 **/
public class MinimumCosttoMergeStones {
    public int mergeStones(int[] stones, int K) {
        if(K<2)
            return -1;
        int length = stones.length;
        if(length%(K-1)==1||K==2){
            while (length>1) {
                int ans = 0;
                for (int i = 0; i < length - K; i++) {
                    int res = 0;
                    for (int j = i; j < i + K; j++) {
                        res += stones[j];
                    }
                    ans = Math.min(res, ans);
                }
            }
        }
        else
            return -1;
    }
}

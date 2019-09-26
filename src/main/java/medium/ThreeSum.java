package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * @author: wangtengke
 * @create: 2018-12-12
 **/
public class ThreeSum {
    public int[] visited;
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        visited = new int[nums.length];
        dfs(0, nums, cur, list, 0);
        return list;
    }

    public void dfs(int index, int[] nums, List<Integer> cur, List<List<Integer>> list, int target){
        if(index == nums.length)
            return;
        if(target==0 && cur.size()==3){
            list.add(new ArrayList<>(cur));
            return;
        }
        if(cur.size()==3)
            return;
        for(int i=index; i<nums.length; i++){
            if(visited[i]==0){
                visited[i] = 1;
                cur.add(nums[i]);
                dfs(i+1, nums, cur, list, target-nums[i]);
                cur.remove(cur.size()-1);
                visited[i] = 0;
            }

        }
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}

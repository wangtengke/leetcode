package DFS;

import medium.SubarraySumEqualsK;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-20
 **/
public class Subsets {
    public List<List<Integer>> list = new ArrayList<>();
    public ArrayList<Integer> cur = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for(int i=0; i<=n; i++){
            dfs(i, 0, nums, cur, list);
        }
        return list;
    }

    public void dfs(int n, int index, int[] nums, List<Integer> cur, List<List<Integer>> list){
        if(n==cur.size()){
            list.add(new ArrayList<>(cur));
            return;
        }

        for(int i=index; i<nums.length; i++){
            cur.add(nums[i]);
            dfs(n, i+1, nums, cur, list);
            cur.remove(Integer.valueOf(nums[i]));
        }
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        subsets.subsets(new int[]{1,2,3});
    }

}

package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-04
 **/
public class Triangle {
    public int minimumTotal(List<List<Integer>> t) {
        if(t == null) return 0;
        int[] dp = new int[t.size()];
        int n = dp.length;
        dp[0] = t.get(0).get(0);
        if(n==1) return dp[0];
        return dp[0] + dfs(0, dp, t, 1);
    }

    public int dfs(int x, int[] dp, List<List<Integer>> t, int index){
        List<Integer> cur = t.get(index);
        if(index==dp.length-1) return cur.get(x);
        dp[index] = Math.min(cur.get(x) + dfs(x, dp, t, index+1) , cur.get(x+1) + dfs(x+1, dp, t, index+1));
        return dp[index];
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        cur.add(-10);
        list.add(cur);
        triangle.minimumTotal(list);
    }

}

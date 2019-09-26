package hard;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-01
 **/
public class CherryPickup {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][] dp = new int[n][n][n];
        //dp[x1][x2][y1] = dp[x1-1][x2-1][y2], dp[x1][x2][y1-1], dp[x1][x2-1][y1]
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }
        // dfs(dp, n-1, n-1, n-1);
        return Math.max(0, dfs(grid,dp, 0, 0, 0));
    }

    public int dfs(int[][] grid, int[][][] dp, int x1, int x2, int y1){
        int n = dp.length;
        int y2 = x1+y1-x2;
        if(x1==1 && y1==4 && x2==1 && y2==4){
            System.out.println("111");
        }
        if(x1>=n || y1>=n || x2>=n || y2>=n) return -1;
        if(grid[x1][y1]<0 || grid[x2][y2]<0) return -1;
        if(dp[x1][x2][y1]!=Integer.MIN_VALUE) return dp[x1][x2][y1];
        if (x1 == n-1 && y1 == n-1) return grid[x1][y1];
        dp[x1][x2][y1] = Math.max(Math.max(dfs(grid, dp, x1+1, x2, y1), dfs(grid, dp,x1+1, x2+1, y1)) ,Math.max(dfs(grid, dp, x1, x2, y1+1), dfs(grid, dp, x1, x2+1, y1+1)));
        if(dp[x1][x2][y1]>=0){
            dp[x1][x2][y1]++;
            if(x1!=x2) dp[x1][x2][y1]++;
        }
        return dp[x1][x2][y1];
    }

    public static void main(String[] args) {
        CherryPickup cherryPickup = new CherryPickup();
        cherryPickup.cherryPickup(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,-1,1,1},{0,-1,-1,1,1},{1,1,1,1,1}});
    }
}

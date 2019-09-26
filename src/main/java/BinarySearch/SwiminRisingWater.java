package BinarySearch;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-12
 **/
public class SwiminRisingWater {
    public int swimInWater(int[][] grid) {
        // corner case
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int n = grid[0].length;
        int left = grid[0][0];
        int right = n*n - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            boolean[][] visited = new boolean[n][n];
            if(hasPath(grid, n, 0, 0, visited, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    // return if there is a path from grid[i][j] to grid[n - 1][n - 1]
    // with the max time <= time
    public boolean hasPath(int[][] grid, int n, int i, int j, boolean[][] visited, int time){
        // base case
        if(i < 0 || i >= n || j < 0 || j >= n || visited[i][j] || grid[i][j] > time) return false;
        if(i == n - 1 && j == n - 1) return true;

        int[][] DIRS = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        visited[i][j] = true;
        for(int[] dir : DIRS){
            int newX = i + dir[0];
            int newY = j + dir[1];
            if(hasPath(grid, n, newX, newY, visited, time)) return true;
        }
        // visited[i][j] = false; // no need to this for early pruning

        return false;
    }

    public static void main(String[] args) {
        SwiminRisingWater swiminRisingWater = new SwiminRisingWater();
        swiminRisingWater.swimInWater(new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}});
    }

}

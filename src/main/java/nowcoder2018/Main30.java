package nowcoder2018;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-10
 **/
public class Main30 {
    boolean[][] grid;
    int count = 0;
    int[][] dict = new int[][]{{0, 1},{0, -1},{1, 0},{-1, 0}};
    public int movingCount(int threshold, int rows, int cols)
    {
        grid = new boolean[rows][cols];
        dfs(threshold, 0 , 0, rows, cols);
        return count;
    }

    public void dfs(int k, int x, int y, int rows, int cols) {
        if(x >= rows || y >= cols || x<0 || y<0) return;
        if(grid[x][y]) return;
        grid[x][y] = true;
        int sum = 0;
        String s = String.valueOf(x) + String.valueOf(y);
        for(int i=0; i<s.length(); i++) sum += Integer.valueOf(s.substring(i,i+1));
        System.out.println("x: "+ x + "  y: "+ y + "  sum: "+ sum);
        if(sum<=k) count++;
        for(int[] d: dict) {
            dfs(k, x + d[0], y + d[1], rows, cols);

        }
    }

    public static void main(String[] args) {
        Main30 m = new Main30();
        m.movingCount(10, 1, 100);
    }
}

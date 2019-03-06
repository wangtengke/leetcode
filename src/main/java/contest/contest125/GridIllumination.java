package contest.contest125;

/**
 * @program: leetcode
 * @description:
 * On a N x N grid of cells, each cell (x, y) with 0 <= x < N and 0 <= y < N has a lamp.
 *
 * Initially, some number of lamps are on.  lamps[i] tells us the location of the i-th lamp that is on.  Each lamp that is on illuminates every square on its x-axis, y-axis, and both diagonals (similar to a Queen in chess).
 *
 * For the i-th query queries[i] = (x, y), the answer to the query is 1 if the cell (x, y) is illuminated, else 0.
 *
 * After each query (x, y) [in the order given by queries], we turn off any lamps that are at cell (x, y) or are adjacent 8-directionally (ie., share a corner or edge with cell (x, y).)
 *
 * Return an array of answers.  Each value answer[i] should be equal to the answer of the i-th query queries[i].
 *
 *
 *
 * Example 1:
 *
 * Input: N = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
 * Output: [1,0]
 * Explanation:
 * Before performing the first query we have both lamps [0,0] and [4,4] on.
 * The grid representing which cells are lit looks like this, where [0,0] is the top left corner, and [4,4] is the bottom right corner:
 * 1 1 1 1 1
 * 1 1 0 0 1
 * 1 0 1 0 1
 * 1 0 0 1 1
 * 1 1 1 1 1
 * Then the query at [1, 1] returns 1 because the cell is lit.  After this query, the lamp at [0, 0] turns off, and the grid now looks like this:
 * 1 0 0 0 1
 * 0 1 0 0 1
 * 0 0 1 0 1
 * 0 0 0 1 1
 * 1 1 1 1 1
 * Before performing the second query we have only the lamp [4,4] on.  Now the query at [1,0] returns 0, because the cell is no longer lit.
 * @author: wangtengke
 * @create: 2019-02-24
 **/
public class GridIllumination {
    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        int[][] grid = new int[5][5];
        for (int i = 0; i < lamps.length ; i++) {
            int X = lamps[i][0];
            int Y = lamps[i][1];
            grid[X][Y] -=1;
            for (int j = 0; j < N ; j++) {
                grid[X][j] +=1;
                grid[j][Y] +=1;
            }
            int b = 1;
            while (b+X<N && b+Y<N){
                grid[X+b][Y+b] += 1;
                b++;
            }
             b = 1;
            while (X-b>=0 && Y-b>=0){
                grid[X-b][Y-b]+=1;
                b++;
            }
            b = 1;
            while (X-b>=0 && Y+b<N){
                grid[X-b][Y+b] +=1;
                b++;
            }
            b = 1;
            while (X+b<N && Y-b>= 0){
                grid[X+b][Y-b] += 1;
                b++;
            }
        }
        return null;
    }
}

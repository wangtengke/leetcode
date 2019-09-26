package contest.contest134;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-28
 **/
public class ColoringABorder {
    public int[][] mark;
    public int[][] visited;
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
        mark = new int[grid.length][grid[0].length];
        visited = new int[grid.length][grid[0].length];
        int m = grid[r0][c0];
        dfs(m, r0, c0, grid);
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(mark[i][j]==1&&(i-1<0||j-1<0||i+1>=grid.length||j+1>=grid[0].length||grid[i+1][j]==0||grid[i-1][j]==0||grid[i][j+1]==0||grid[i][j-1]==0)){
                    mark[i][j]=2;
                }
            }
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(mark[i][j]==2){
                    grid[i][j] = color;
                }
            }
        }
        return grid;
    }

    public void dfs(int m, int x, int y, int[][] grid){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length)
            return;
        if(visited[x][y]==1)
            return;
        if(grid[x][y]!=m)
            return;
        mark[x][y] = 1;
        visited[x][y]=1;
        dfs(m, x+1, y, grid);
        dfs(m, x-1, y, grid);
        dfs(m, x, y+1, grid);
        dfs(m, x, y-1, grid);
    }

    public static void main(String[] args) {
        ColoringABorder coloringABorder = new ColoringABorder();
        coloringABorder.colorBorder(new int[][]{{1,2,1,2,1,2},{2,2,2,2,1,2},{1,2,2,2,1,2}},1,3,1);
//        [[1,2,1,2,1,2],[2,2,2,2,1,2],[1,2,2,2,1,2]]
//1
//3
//1
    }
}

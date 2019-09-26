package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-30
 **/
public class ShortestBridge {
    boolean[][] visited;
    public int shortestBridge(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        visited = new boolean[m][n];
        int[][] dict = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
        boolean find = false;
        for(int i=0; i<m; i++){
            if(find)
                break;
            for(int j=0; j<n; j++){
                if(A[i][j]==1){
                    dfs(i, j, q, A);
                    find = true;
                    break;
                }
            }
        }
        int step = 0;
        while(q.size()!=0){
            Queue<int[]> qq = new LinkedList<>();
            while(q.size()!=0){
                int[] cell = q.poll();
                for(int i=0; i<dict.length; i++){
                    int x = cell[0] + dict[i][0];
                    int y = cell[1] + dict[i][1];
                    if(x<0||y<0||x>=visited.length||y>=visited[0].length||visited[x][y])
                        continue;
                    if(A[x][y]==1)
                        return step;
                    visited[x][y] = true;
                    qq.add(new int[]{x, y});

                }
            }
            step++;
            q = qq;
            System.out.println(qq.size());
        }
        return -1;

    }

    public void dfs(int x, int y, Queue<int[]> q, int[][] A){
        if(x<0||y<0||x>=visited.length||y>=visited[0].length||visited[x][y]||A[x][y]==0)
            return;
        if(A[x][y]==1){
            q.add(new int[]{x, y});
            visited[x][y] = true;
        }
        dfs(x+1, y, q, A);
        dfs(x-1, y, q, A);
        dfs(x, y+1,  q, A);
        dfs(x, y-1,  q, A);
    }

    public static void main(String[] args) {
        ShortestBridge shortestBridge = new ShortestBridge();
        shortestBridge.shortestBridge(new int[][]{{0,1,0},{0,0,0},{0,0,1}});
    }

}

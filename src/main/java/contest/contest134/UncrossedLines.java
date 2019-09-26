package contest.contest134;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-28
 **/
public class UncrossedLines {
    public int[][] visited;
    public int ans = 0;
    public int count = 0;
    public int maxUncrossedLines(int[] A, int[] B) {
        visited = new int[A.length][B.length];
        dfs(0, 0, A, B);
        return ans;
    }

    public void dfs(int x, int y, int[] a, int[] b){
        if(x==a.length){
            ans = Math.max(ans, count);
            return;
        }
        if(y>=b.length) {
            ans = Math.max(ans, count);
            return;
        }
        if(visited[x][y]==1)
            return;
        for(int i=y; i<b.length; i++){
            if(a[x]==b[i]){
                visited[x][y] =1;
                count++;
                dfs(x+1,i+1,a,b);
                count--;
                visited[x][y] = 0;
            }
        }
        dfs(x+1,y,a,b);
    }
    public static void main(String[] args) {
        UncrossedLines u = new UncrossedLines();
        u.maxUncrossedLines(new int[]{2,5,1,2,5},new int[]{10,5,2,1,5,2});
//        [2,5,1,2,5]
//[10,5,2,1,5,2]
    }

}

package medium;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-01
 **/
public class KnightDialer {
    public int knightDialer(int N) {
        int mod = 100000007;
        int[][] chess = new int[][]{{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        int[][] dict = new int[][]{{1,2},{1,-2},{2,1},{2,-1},{-1,2},{-1,-2},{-2,1},{-2,-1}};
        int[][][] dp = new int[4][3][N+1];
        if(N==1) return 10;
        for(int i=1; i<=N; i++){
            for(int x=0; x<4; x++){
                for(int y=0; y<3; y++){
                    if(i==1) dp[x][y][i] = 1;
                    else{
                        for(int[] add: dict){
                            if(x+add[0]==1 && y+add[1]==1) continue;
                            if(x+add[0]==3 && (y+add[1]==0||y+add[1]==2)) continue;
                            if(x+add[0]>3||x+add[0]<0||y+add[1]>2||y+add[1]<0) continue;

                            dp[x][y][i] = (dp[x][y][i] + dp[x+add[0]][y+add[1]][i-1])%mod;
                        }
                    }
                }
            }
        }
        int res = 0;
        for(int x=0; x<3; x++){
            for(int y=0; y<3; y++){
                res = (res + dp[x][y][N])%mod;
            }
        }
        res = (res + dp[3][1][N])%mod;
        return res;
    }

    public static void main(String[] args) {
        KnightDialer knightDialer = new KnightDialer();
        knightDialer.knightDialer(2);
    }

}

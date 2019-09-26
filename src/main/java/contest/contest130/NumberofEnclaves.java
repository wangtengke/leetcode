package contest.contest130;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-31
 **/
public class NumberofEnclaves {
    public int numEnclaves(int[][] A) {
        int col = A.length;
        int raw = A[0].length;
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j < raw; j++) {
                if(A[i][j]==1&&(i==0||j==0||i==col-1||j==raw-1)) {
                    A[i][j]=2;
                }
            }
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < col-1; i++) {
                for (int j = 1; j < raw-1; j++) {
                    if (A[i][j] == 1 && (A[i][j - 1] == 2 || A[i][j + 1] == 2 || A[i - 1][j] == 2 || A[i + 1][j] == 2)) {
                        A[i][j] = 2;
                        flag = true;
                        break;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < raw; j++) {
                if(A[i][j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        NumberofEnclaves numberofEnclaves = new NumberofEnclaves();
        numberofEnclaves.numEnclaves(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}});
    }
}

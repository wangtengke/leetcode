package easy;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-20
 **/
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            int x = 0;
            int y = i;
            while(x>=0 && y>=0 && y+1<m && x+1<n){
                if(matrix[x][y]!=matrix[x+1][y+1]) return false;
                x++;
                y++;
            }
        }
        for(int i=0; i<n; i++){
            int x = i;
            int y = 0;
            while(x>=0 && y>=0 && y+1<m && x+1<n){
                if(matrix[x][y]!=matrix[x+1][y+1]) return false;
                x++;
                y++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        toeplitzMatrix.isToeplitzMatrix(new int[][]{
                {11,74,0,93},{40,11,74,7}});
    }

}

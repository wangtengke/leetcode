package BFS;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-29
 **/
public class Matrix01 {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        int count = 0;
        int flag = 1;
        while(flag!=0){
            flag = 0;
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    if(matrix[i][j]!=0&&nearZero(matrix, i, j)){
                        res[i][j] = count+1;
                        matrix[i][j] = 0;
                        flag++;
                    }
                }
            }
            count++;
        }

        return res;
    }

    public boolean nearZero(int[][] matrix, int x, int y){
        if(x>0){
            if(matrix[x-1][y]==0)
                return true;
        }
        if(y>0){
            if(matrix[x][y-1]==0)
                return true;
        }
        if(x<matrix.length-1){
            if(matrix[x+1][y]==0)
                return true;
        }
        if(y<matrix[0].length-1){
            if(matrix[x][y+1]==0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Matrix01 matrix01 = new Matrix01();
        matrix01.updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
    }

}

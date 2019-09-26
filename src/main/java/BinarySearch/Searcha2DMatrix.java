package BinarySearch;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-07
 **/
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i< m-1; i++){
            if((matrix[i][0]<=target) && (matrix[i+1][0] > target)){
                for(int j=0; j<n; j++){
                    if(matrix[i][j]==target)
                        return true;
                }
            }
        }
        for(int j=0; j<n; j++){
            if(matrix[m-1][j]==target)
                return true;
        }
        return false;
    }

}

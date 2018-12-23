package contest.contest116;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-23
 **/
public class MaximumWidthRamp {
    public int maxWidthRamp(int[] A) {
        int end = A.length;
        int res = 0;
        int dif = 0;
        for (int i = 0; i <end-dif; i++) {
            for (int j = i+1;j<end;j++){
                if(A[j]>=A[i]){
                    res = Math.max(res,j-i);
                    dif = res;
                }
            }
        }
        return res;
    }

}

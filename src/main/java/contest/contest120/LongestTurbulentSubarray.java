package contest.contest120;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-01-20
 **/
public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] A) {
        if(A.length<2)
            return A.length;
        int count = 1;
        int max = 1;
        int flag = 0;
        for (int i = 0; i <A.length-1 ; i++) {
            if(i%2==0) {
                if (A[i] < A[i + 1]) {
                    count++;
                }
                else {
                    max = Math.max(max,count);
                    count=1;
                }
            }
            if(i%2==1){
                if (A[i] > A[i + 1]) {
                    count++;
                }
                else {
                    max = Math.max(max,count);
                    count=1;
                }
            }
        }
        max = Math.max(max,count);
        count=1;
        for (int i = 0; i <A.length-1 ; i++) {
            if(i%2==1) {
                if (A[i] < A[i + 1]) {
                    count++;
                }
                else {
                    max = Math.max(max,count);
                    count=1;
                }
            }
            if(i%2==0){
                if (A[i] > A[i + 1]) {
                    count++;
                }
                else {
                    max = Math.max(max,count);
                    count=1;
                }
            }
        }
        return max;
        }


    public static void main(String[] args) {
        LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();
        longestTurbulentSubarray.maxTurbulenceSize(new int[]{0,8,45,88,48,68,28,55,17,24});
    }
}

package contest.contest127;

import java.util.HashMap;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-10
 **/
public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] A, int[] B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <A.length ; i++) {
            if(map.containsKey(A[i]))
            map.put(A[i],map.get(A[i])+1);
            else{
                map.put(A[i],1);
            }
            if(map.containsKey(B[i]))
                map.put(B[i],map.get(B[i])+1);
            else{
                map.put(B[i],1);
            }
        }
        int countA = 0;
        int countB = 0;
        for (int i = 1; i < 6; i++) {
            if(map.containsKey(i)){
                if(map.get(i)>=A.length){
                    for (int j = 0; j < A.length; j++) {
                        if(A[j]==i&&B[j]!=i)
                            countA++;
                        else if(A[j]!=i&&B[j]==i)
                            countB++;
                        else if(A[j]!=i&&B[j]!=i)
                            return -1;
                    }
                    return Math.min(countA,countB);
                }
            }
        }
        return -1;
    }
}

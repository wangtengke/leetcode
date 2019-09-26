package contest.contest138;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-26
 **/
public class PreviousPermutationWithOneSwap {
    public int[] prevPermOpt1(int[] A) {
        int[] temp = A.clone();
        Arrays.sort(A);
        int flag = 0;
        for(int i=0; i<A.length; i++){
            if(temp[i]!=A[i]){
                flag = 1;
                break;
            }
        }
        System.out.println(flag);
        if(flag ==0) return A;
        else{
            int f = 0;
            for(int i=temp.length-1; i>=1; i--){
                if(f==1) break;
                if(temp[i]<temp[i-1]){
                    for(int j=temp.length-1; j>=i; j--){
                        if(temp[j]<temp[i-1]){
                            int t = temp[j];
                            temp[j] = temp[i-1];
                            temp[i-1] = t;
                            f=1;
                            break;
                        }
                    }

                }
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        PreviousPermutationWithOneSwap previousPermutationWithOneSwap = new PreviousPermutationWithOneSwap();
        previousPermutationWithOneSwap.prevPermOpt1(new int[]{1,9,4,6,7});
    }

}

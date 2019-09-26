package contest.contest134;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-28
 **/
public class MovingStonesUntilConsecutive {
    public int[] numMovesStones(int a, int b, int c) {
        int[] abc = new int[3];
        abc[0] = a;
        abc[1] = b;
        abc[2] = c;
        int min = 0;
        int max = 0;
        Arrays.sort(abc);
        int[] ans = new int[2];
        if(abc[1]-abc[0]==1 || abc[2]-abc[1]==1){
            min = 0;
        }
        else if(abc[1]-abc[0]<=2 || abc[2]-abc[1]<=2){
            min = 1;
        }
        else{
            min = 2;
        }
        max = abc[1] - abc[0] -1 + abc[2] - abc[1] -1;

        ans[0] = min;
        ans[1] = max;
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        return ans;
    }

    public static void main(String[] args) {
        MovingStonesUntilConsecutive movingStonesUntilConsecutive =new MovingStonesUntilConsecutive();
        movingStonesUntilConsecutive.numMovesStones(1,5,3);
    }

}

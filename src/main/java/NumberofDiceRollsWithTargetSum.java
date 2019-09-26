import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-08-11
 **/
public class NumberofDiceRollsWithTargetSum {
    int res = 0;
    public int numRollsToTarget(int d, int f, int target) {
        for(int i=1; i<=f; i++) {
            dfs(i, 0, target, 0, d, f);
        }
        return res;
    }

    public void dfs(int index, int sum, int target, int count, int d, int f) {
        if(count>d) return;
        if(sum > target) return;
        if(sum==target && count<d) return;
        if(sum==target && count==d) {
            res = (res + 1)%1000000007;
            return;
        }
        for(int i=1; i<=f; i++) {
            dfs(i, index + sum, target, count+1, d, f);
        }
    }

    public static void main(String[] args) {
        NumberofDiceRollsWithTargetSum n = new NumberofDiceRollsWithTargetSum();
        n.numRollsToTarget(1,6,3);
    }

}

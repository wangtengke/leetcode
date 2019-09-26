package contest.contest129;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-24
 **/
public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i <A.length ; i++) {
            sum +=A[i];
        }
        if(sum%3!=0)
            return false;
        else {
            int part = sum/3;
            int begin = 0;
            int count =0;
            for (int i = 0; i <A.length ; i++) {
                begin +=A[i];
                if(begin==part) {
                    begin = 0;
                    count++;
                }
            }
            if(count==3)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {

    }
}

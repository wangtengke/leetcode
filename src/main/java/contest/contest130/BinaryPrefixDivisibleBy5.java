package contest.contest130;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-31
 **/
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new LinkedList<>();
        int j = 0;
        for (int i = 0; i <A.length ; i++) {
            j = j *2 +A[i];
            if(j%5==0)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}

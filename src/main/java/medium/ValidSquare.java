package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-23
 **/
public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(dis(p1, p2), dis(p1, p3), dis(p1, p4), dis(p2, p3), dis(p2, p4), dis(p3, p4)));
        return set.size()==2 && !set.contains(0);
    }

    public int dis(int[] p, int [] q){
        return (p[0]-q[0])*(p[0]-q[0]) + (p[1]-q[1])*(p[1]-q[1]);
    }
}

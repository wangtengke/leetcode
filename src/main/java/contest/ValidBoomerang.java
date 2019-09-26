package contest;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-05
 **/
public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        Arrays.sort(points,(a, b) ->a[0]-b[0] );
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        if((x1==x2&&y1==y2)||(x1==x3&&y1==y3)|| (x2==x3&&y2==y3))
            return false;
        if(Math.abs(x1-x2)==Math.abs(x2-x3) && Math.abs(y1-y2)==Math.abs(y2-y3))
            return false;
        return true;
    }

}

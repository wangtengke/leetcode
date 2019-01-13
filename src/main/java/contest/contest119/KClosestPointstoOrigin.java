package contest.contest119;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        int[][] res = new int[K][2];
        for (int i = 0; i <K ; i++) {
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
        }
        return res;
    }

    public static void main(String[] args) {
        KClosestPointstoOrigin kClosestPointstoOrigin = new KClosestPointstoOrigin();
        kClosestPointstoOrigin.kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
    }
}

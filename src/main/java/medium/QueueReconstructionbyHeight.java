package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 *
 * Note:
 * The number of people is less than 1,100.
 *
 *
 * Example
 *
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * @author: wangtengke
 * @create: 2019-01-06
 **/
public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }
        return queue.toArray(new int[queue.size()][]);
    }

    public static void main(String[] args) {
        QueueReconstructionbyHeight queueReconstructionbyHeight = new QueueReconstructionbyHeight();
        int[][] points = new int[6][2];
        points[0]= new int[]{7, 0};
        points[1]= new int[]{4, 4};
        points[2]= new int[]{7, 1};
        points[3]= new int[]{5, 0};
        points[4]= new int[]{6, 1};
        points[5]= new int[]{5, 2};
         queueReconstructionbyHeight.reconstructQueue(points);
    }
}

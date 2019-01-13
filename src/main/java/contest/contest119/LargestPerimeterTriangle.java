package contest.contest119;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 *
User Accepted: 1037
User Tried: 1271
Total Accepted: 1047
Total Submissions: 1707
Difficulty: Easy
Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.

If it is impossible to form any triangle of non-zero area, return 0.



Example 1:

Input: [2,1,2]
Output: 5
Example 2:

Input: [1,2,1]
Output: 0
Example 3:

Input: [3,2,3,4]
Output: 10
Example 4:

Input: [3,6,2,3]
Output: 8
 * @author: wangtengke
 * @create: 2019-01-13
 **/
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i >=2 ; i--) {
            int max = A[i];
            int mid = A[i-1];
            int min = A[i-2];
            if(max<mid+min)
                return max+mid+min;
        }
        return 0;
    }
}

package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 * @author: wangtengke
 * @create: 2018-12-16
 **/
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <nums.length+1 ; i++) {
            if(!set.contains(i))
                array.add(i);
            }
        return array;
//      a good solution
//        List<Integer> ret = new ArrayList<Integer>();
//
//        for(int i = 0; i < nums.length; i++) {
//            int val = Math.abs(nums[i]) - 1;
//            if(nums[val] > 0) {
//                nums[val] = -nums[val];
//            }
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] > 0) {
//                ret.add(i+1);
//            }
//        }
//        return ret;
    }
}

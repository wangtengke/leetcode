import jdk.nashorn.internal.ir.Block;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @program: leetcode
 * @description:
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author: wangtengke
 * @create: 2018-12-11
 **/
public  class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
//        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
             int max = 0;
        String sub = "";
        for(int i = 0; i < s.length(); i++){
            if( sub.contains(s.substring(i, i+1))){
                if (sub.length() > max)
                    max = sub.length();
                sub = sub.substring(sub.indexOf(s.charAt(i))+1);
                sub = sub + (s.substring(i, i+1));
            }
            else{
                sub = sub + (s.charAt(i));
                max = (sub.length() > max) ? sub.length() : max;
            }
        }
        return max;

//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
//        // try to extend the range [i, j]
//        for (int j = 0, i = 0; j < n; j++) {
//            if (map.containsKey(s.charAt(j))) {
//                i = Math.max(map.get(s.charAt(j)), i);
//            }
//            ans = Math.max(ans, j - i + 1);
//            map.put(s.charAt(j), j + 1);
//        }
//        return ans;
    }

    public static void  main(String[] args){
        int i=LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" dvdfd");
        System.out.println(i);
    }
}

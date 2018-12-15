package easy;

/**
 * @program: leetcode
 * @description:
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * Note:
 * The input string length won't exceed 1000.
 * @author: wangtengke
 * @create: 2018-12-15
 **/
public class PalindromicSubstrings {
    public int count = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i <s.length() ; i++) {
            checkPalindromicSubstrings(s,i,i);
            checkPalindromicSubstrings(s,i,i+1);
        }
        return count;
    }

    private void checkPalindromicSubstrings(String s, int low, int high) {
        while (low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
            count++;
            low--;
            high++;
        }
    }
}

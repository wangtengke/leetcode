/**
 * @program: leetcode
 * @description:
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 * @author: wangtengke
 * @create: 2018-12-11
 **/
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        String result="";
        for (int i =0; i<s.length();i++){
            String len1 = searchfrommid(s,i,i);
            String len2 = searchfrommid(s,i,i+1);
            if(len1.length()>result.length()){
                result = len1;
            }
            if(len2.length()>result.length()){
                result = len2;
            }
        }
        return result;
    }

    private String searchfrommid(String s, int low ,int high) {
        String len1="";
        int begin = 0;
        int end = s.length()-1;
        while (low>=begin && high <= end){
            if(s.charAt(low)==s.charAt(high)){
                len1 = s.substring(low,high+1);
                low --;
                high ++;
            }
            else 
            break;
        }
        return len1;
    }
    public static void main(String[] args){
        LongestPalindromicSubstring s = new LongestPalindromicSubstring();
        s.longestPalindrome("abcda");
    }
}

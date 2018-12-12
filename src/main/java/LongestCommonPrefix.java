/**
 * @program: leetcode
 * @description: 最长公共子串
 * @author: wangtengke
 * @create: 2018-12-12
 **/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null)       return null;
        if (strs.length == 0)   return "";

        String first = strs[0], last = strs[0];

        for (String str : strs) {
            if (str.compareTo(first) < 0)
                first = str;
            if (str.compareTo(last) > 0)
                last = str;
        }

        int i = 0, len = Math.min(first.length(), last.length());

        while (i < len && first.charAt(i) == last.charAt(i))
            i++;

        return first.substring(0, i);
    }
    public static void main(String[] args){
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

}

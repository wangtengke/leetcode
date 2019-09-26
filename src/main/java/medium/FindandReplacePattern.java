package medium;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-28
 **/
public class FindandReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            String s = words[i];
           int[] arr = new int[26];
           Arrays.fill(arr, -1);
            for (int j = 0; j <s.length() ; j++) {
                if(arr[s.charAt(j)-'a'] == -1) {
                    arr[s.charAt(j)-'a'] = pattern.charAt(j)-'a';
                }
                else if(arr[s.charAt(j)-'a']>-1) {
                    if(arr[s.charAt(j)-'a'] != pattern.charAt(j)-'a') break;
                }
                if(j==s.length()-1) {
                    Set<Integer> set = new HashSet<>();
                    for(int k=0; k<arr.length; k++) {
                        if(set.contains(arr[k])) break;
                        if(arr[k]>-1) set.add(arr[k]);
                        if(k==arr.length-1) {
                            list.add(s);
                        }
                    }
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        FindandReplacePattern findandReplacePattern = new FindandReplacePattern();
        findandReplacePattern.findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb");
    }

}

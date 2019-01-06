package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
 *
 * Example 1:
 * Input: S = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 * Note:
 *
 * S will have length in range [1, 500].
 * S will consist of lowercase letters ('a' to 'z') only.
 * @author: wangtengke
 * @create: 2019-01-06
 **/
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] res = new int[26];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <S.length() ; i++) {
            res[S.charAt(i)-'a']=i;
        }
        int j =0;
        int cnt =-1;
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j,res[S.charAt(i)-'a']);
            if(i==j) {
                list.add(j - cnt);
                cnt = j;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        PartitionLabels partitionLabels = new PartitionLabels();
        partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
    }
}

package contest.contest125;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 *
 * If the town judge exists, then:
 *
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 *
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: N = 2, trust = [[1,2]]
 * Output: 2
 * Example 2:
 *
 * Input: N = 3, trust = [[1,3],[2,3]]
 * Output: 3
 * Example 3:
 *
 * Input: N = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 * Example 4:
 *
 * Input: N = 3, trust = [[1,2],[2,3]]
 * Output: -1
 * Example 5:
 *
 * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * Output: 3
 * @author: wangtengke
 * @create: 2019-02-24
 **/
public class FindtheTownJudge {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==0)
            return N;
        int mark = -1;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <trust.length ; i++) {
            set.add(trust[i][0]);
            if(map.containsKey(trust[i][1])) {
                map.put(trust[i][1], map.get(trust[i][1]) + 1);
                if(map.get(trust[i][1])==N-1){
                    mark = trust[i][1];
                }
            }
            else {
                map.put(trust[i][1], 1);
                if(map.get(trust[i][1])==N-1){
                    mark = trust[i][1];
                }
            }
        }
        if(set.contains(mark))
            return -1;
        else
            return mark;
    }

    public static void main(String[] args) {
        FindtheTownJudge findtheTownJudge = new FindtheTownJudge();
        findtheTownJudge.findJudge(2,new int[][]{{1,2}});
    }
}

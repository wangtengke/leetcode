package contest.contest126;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program: leetcode
 * @description: '
 * 1002. Find Common Characters
 * User Accepted: 0
 * User Tried: 0
 * Total Accepted: 0
 * Total Submissions: 0
 * Difficulty: Easy
 * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
 *
 * You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 *
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 *
 * @author: wangtengke
 * @create: 2019-03-03
 **/
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {

        for (int i = 0; i <A.length-1 ; i++) {
            String[] start = A[i].split("");
            String[] end = A[i+1].split("");
            Map<String,Integer> map1 = new HashMap<>();
            for (int j = 0; j <start.length ; j++) {
               if(map1.containsKey(start[j])){
                map1.put(start[j],map1.get(start[j])+1);
               }
               else {
                   map1.put(start[j],1);
               }
            }
            String ans = "";
            for (int j = 0; j <end.length ; j++) {
                if(map1.containsKey(end[j])&&map1.get(end[j])>1){
                    ans = ans.concat(end[j]);
                    map1.put(end[j],map1.get(end[j])-1);
                }
                else if(map1.containsKey(end[j])&&map1.get(end[j])==1){
                    ans = ans.concat(end[j]);
                    map1.remove(end[j]);
                }
            }
            A[i+1]=ans;

        }
        if(A[A.length-1].length()==0)
            return new LinkedList<>();
        String[] res = A[A.length-1].split("");
        List<String> list = new LinkedList<>();
        for(String s : res){
            list.add(s);
        }
        return list;
    }

}

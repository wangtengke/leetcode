package PartitiontoKEqualSumSubsets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-04
 **/
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> map = new HashMap<>();
        return dfs(s, wordDict, map);
    }

    public boolean dfs(String s, List<String> wordDict, Map<String, Boolean> map){
        if(map.containsKey(s))
            return map.get(s);
        if(wordDict.contains(s))
            return true;
        if(wordDict.contains(s))
            map.put(s, true);
        else
            map.put(s, false);
        for(int i=0; i<s.length(); i++){
            String left = s.substring(0, i);
            String right = s.substring(i);
//            Long.parseLong()
            if(dfs(left, wordDict, map) && dfs(right, wordDict, map))
                return true;
        }
        return false;
    }

}

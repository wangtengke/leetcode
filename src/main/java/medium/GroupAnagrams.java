package medium;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-09
 **/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new LinkedList<>();
        List<String> cur = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key))
                map.put(key, new LinkedList<>());
            map.get(key).add(strs[i]);
        }
        return (List<List<String>>) map.values();
    }

}

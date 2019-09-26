package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-22
 **/
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(pattern.length()!=strs.length) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            int num1 = 0;
            int num2 = 0;
            if(map1.containsKey(pattern.charAt(i)))
                num1 = map1.get(pattern.charAt(i));
            else{
                num1 = map1.size()+1;
                map1.put(pattern.charAt(i), num1);
            }
            if(map2.containsKey(strs[i]))
                num2 = map2.get(strs[i]);
            else{
                num2 = map2.size()+1;
                map2.put(strs[i], num2);
            }
            if(num1!=num2) return false;
        }
        return true;
    }

}

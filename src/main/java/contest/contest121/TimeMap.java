package contest.contest121;

import java.util.HashMap;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-01-27
 **/
public class TimeMap {
    /** Initialize your data structure here. */
    private HashMap<String,HashMap<Integer,String>> map = new HashMap<>();
    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key))
            map.get(key).put(timestamp,value);
        else {
            HashMap<Integer, String> map1 = new HashMap<>();
            map1.put(timestamp, value);
            map.put(key, map1);
        }
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        else {
            HashMap map1 = map.get(key);
            if(map1.containsKey(timestamp))
                return (String) map1.get(timestamp);
            else {
                while (timestamp>=0){
                    timestamp--;
                    if(map1.containsKey(timestamp))
                        return (String) map1.get(timestamp);
                }
            }
        }
        return "";
    }
}

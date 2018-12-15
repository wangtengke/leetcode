package hard;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-14
 **/
public class LRUCache {
    private int capacity;
    private HashMap<Integer,Integer> map;
    private List<Integer> queue;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity);
        this.queue = new LinkedList<>();
    }

    public int get(int key) {
        if(map.containsKey(key)){
            queue.remove(Integer.valueOf(key));
            queue.add(key);
            return map.get(key);
        }
        else
            return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            queue.remove(Integer.valueOf(key));
            queue.add(key);
            map.put(key,value);
            return;
        }
        if(map.size()==capacity){
            map.remove(queue.get(0));
            map.put(key,value);
            queue.remove(0);
            queue.add(key);

        }
        else {
            queue.add(key);
            map.put(key,value);
        }
    }
    public static void main(String[] args){
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(2, 1);
        cache.put(2, 2);
        System.out.println(cache.get(2));       // returns 1
        cache.put(1, 1);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 1);    // evicts key 1
        System.out.println(cache.get(2));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4
    }

}

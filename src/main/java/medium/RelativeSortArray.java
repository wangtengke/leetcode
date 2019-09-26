package medium;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-14
 **/
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr1.length; i++) map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j < map.get(arr2[i]); j++) {
                list1.add(arr2[i]);
            }
            map.put(arr2[i], 0);
        }
        List<Integer> list2 = new ArrayList<>();
        for(Integer e: map.keySet()) {
            if(map.get(e)!=0) {
                for(int i=0; i< map.get(e); i++) list2.add(e);
            }
        }
        Collections.sort(list2);
//        int[] res = new int[arr2.size() + arr1. size()];
        for(Integer e : list2) {
            list1.add(e);
        }
        return list1.stream().mapToInt(Integer::intValue).toArray();

    }

}

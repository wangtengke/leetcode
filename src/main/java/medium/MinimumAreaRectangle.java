package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-14
 **/
public class MinimumAreaRectangle {
    public int minAreaRect(int[][] p) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0; i<p.length; i++){
            if(!map.containsKey(p[i][0]))
                map.put(p[i][0], new HashSet<Integer>());
            // ArrayList list = map.get(p[i][0]);
            // list.add(p[i][1]);
            map.get(p[i][0]).add(p[i][1]);
        }
        int min = Integer.MAX_VALUE;
        for(int[] p1: p){
            for(int[] p2: p){
                int x1 = p1[0];
                int y1 = p1[1];
                int x2 = p2[0];
                int y2 = p2[1];
                if(x1==x2|| y1==y2) continue;
                if(map.get(x1).contains(y2) && map.get(x2).contains(y1)) {
                    System.out.println(x1+" " + x2);
                    min = Math.min(min, Math.abs(x1-x2) * Math.abs(y1-y2));
                }
            }
        }
        return min==Integer.MAX_VALUE? 0: min;

    }

    public static void main(String[] args) {
        MinimumAreaRectangle minimumAreaRectangle = new MinimumAreaRectangle();
        minimumAreaRectangle.minAreaRect(new int[][]{{1,1},{1,3},{3,1},{3,3},{2,2}});
    }
}

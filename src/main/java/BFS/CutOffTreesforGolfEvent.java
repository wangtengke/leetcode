package BFS;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-29
 **/
public class CutOffTreesforGolfEvent {
    public int step = -1;
    public int cutOffTree(List<List<Integer>> forest) {
        int[][] arr = new int[forest.size()][50];
        int x =0, y=0;
        for(List<Integer> list: forest){
            for(Integer i: list){
                arr[x][y] = i;
                y++;
            }
            y=0;
            x++;
        }
        dfs(0, 0, arr, 0);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>1)
                    return -1;
            }
        }
        return step;
    }

    private void dfs(int x, int y, int[][] arr, int pre) {
        if(x<0||y<0||x>=arr.length||y>=arr[0].length||arr[x][y]==0||arr[x][y]-pre<0)
            return;
        step++;
        int temp = arr[x][y];
        arr[x][y] = 1;
        dfs(x-1,y,arr, temp);
        dfs(x+1,y,arr, temp);
        dfs(x,y-1,arr, temp);
        dfs(x,y+1,arr, temp);
    }

    public static void main(String[] args) {
        CutOffTreesforGolfEvent cutOffTreesforGolfEvent = new CutOffTreesforGolfEvent();
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> cur = new LinkedList<>();
        cur.add(2);
        cur.add(3);
        cur.add(4);
        List<Integer> cur2 = new LinkedList<>();
        cur2.add(0);
        cur2.add(0);
        cur2.add(5);
        List<Integer> cur3 = new LinkedList<>();
        cur3.add(8);
        cur3.add(7);
        cur3.add(6);
        list.add(cur);
        list.add(cur2);
        list.add(cur3);
        cutOffTreesforGolfEvent.cutOffTree(list);
    }
}

package test;

import java.util.*;
public class Main {
    public static int len = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int[][] array = new int[M][4];
        for (int i=0;i<M;i++){
            for (int j =0;j<4;j++){
                array[i][j] = sc.nextInt();
            }
        }
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i=0;i<M;i++){
            List<int[]> list = map.getOrDefault(array[i][0], new ArrayList<>());
            list.add(array[i]);
            map.put(array[i][0],list);
        }
        road(N,C,map,0,0);
        if (len!=Integer.MAX_VALUE) {
            System.out.println(len);
        }else {
            System.out.println(-1);
        }
    }

    public static void road(int N,int C, Map<Integer, List<int[]>> map, int cur, int road){
        if (C<=0 && cur!=N-1){
            return;
        }
        if (C>=0 && cur== N-1){
            if (road<len){
                len =road;
            }
            return;
        }
        List<int[]> list = map.getOrDefault(cur, new ArrayList<>());
        for (int i=0;i<list.size();i++){
            int[] temp = list.get(i);
            road(N,C-temp[3],map,temp[1],road+temp[2]);
        }
    }
}
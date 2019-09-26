package test;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-21
 **/
public class Main8 {
    public static int res = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] arr = new int[m][4];
        for(int i=0; i<m; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
            arr[i][3] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<m; i++) {
            if(arr[i][0]==0) {
                bfs(n, arr, i, 0, c);
            }
            else break;
        }
        System.out.println(res);
    }

    private static void bfs(int n, int[][] arr, int i, int count, int c) {
        Queue<int[]> q= new LinkedList<>();
        boolean[] visited = new boolean[arr.length];
        q.add(arr[i]);
        visited[i] = true;
        int start = arr[i][0];
        int end = arr[i][1];
        int len = arr[i][2];
        int money = arr[i][3];
        int[] moneys = new int[arr.length];
        int[] lens = new int[arr.length];
        while(q.size()>0) {
            Queue<int[]> qq= new LinkedList<>();
            while (q.size()>0){
                for(int k=0; k<arr.length; k++) {
                    if(visited[i]) continue;
                    if(arr[k][0]==end) {
                        if((moneys[k] - arr[k][3])<0) continue;
                        qq.add(arr[k]);
                        lens[k] += arr[k][2];
                        moneys[k] -= arr[k][3];
                    }
                }
            }

        }
    }

}

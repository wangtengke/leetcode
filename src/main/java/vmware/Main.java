package vmware;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-08
 **/
public class Main {
    public static int count = 0;
    public static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] arr = new int[n-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean[] visited = new boolean[n+1];
        int[] nums = new int[n+1];
        dfs(n, arr, 0, nums, 1, n, visited);
        System.out.println(count);
    }

    private static void dfs(int n, int[] arr, int cnt, int[] nums, int begin, int end, boolean[] visited) {
        System.out.println("begin: "+ begin + " end: "+ end);
        System.out.println(" cnt: " + cnt);
        if(cnt==n) {
            count = (count + 1)% mod;
            for(int k: nums) {
                System.out.print(k + " ");
            }
            System.out.println("\n");
            return;
        }
        for(int i=begin; i<=end; i++) {
            if(visited[i]) continue;
            if(cnt==0) {
                nums[cnt] = i;
                visited[i] = true;
                dfs(n, arr, cnt+1, nums, begin, end, visited);
            }
            else {
                if(arr[cnt-1]==0) {
                    if(nums[cnt-1] < i) {
                        nums[cnt] = i;
                        visited[i] = true;
                        if(cnt==n-1) dfs(n, arr, cnt + 1, nums, begin, end, visited);
                        else if(arr[cnt]==0)
                            dfs(n, arr, cnt + 1, nums, i, end, visited);
                        else
                            dfs(n, arr, cnt + 1, nums, begin, i, visited);
                    }
                }
                else {
                    if(nums[cnt-1]>i) {
                        nums[cnt] = i;
                        visited[i] = true;
                        if(cnt==n-1) dfs(n, arr, cnt + 1, nums, begin, end, visited);
                        else if(arr[cnt]==0)
                            dfs(n, arr, cnt + 1, nums, i, end, visited);
                        else
                            dfs(n, arr, cnt + 1, nums, begin, i,visited);
                    }
                }
            }
            visited[i] = false;
            nums[cnt] = 0;
        }
    }

}

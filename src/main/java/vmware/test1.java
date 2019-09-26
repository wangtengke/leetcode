package vmware;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-21
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
                arr[i][0] = scanner.nextInt();
                arr[i][1] = scanner.nextInt();
        }
        int ans = getresult(arr);
    }

    private static int getresult(int[][] arr) {
        Arrays.sort(arr,(a,b)->(a[0]<b[0]?a[0]:b[0]));
//        int i = 0;
//        while (i<arr.length){
//            if(arr[i][0z]<arr[j])
//        }
        return 0;
    }

}

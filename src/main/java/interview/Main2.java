package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-09
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] child_need = new int[n];
        for (int i = 0; i <n ; i++) {
            child_need[i]= scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] teacher_has = new int[m];
        for (int i = 0; i < m; i++) {
            teacher_has[i] = scanner.nextInt();
        }
        int ans = getresult(child_need,teacher_has);
        System.out.println(ans);
//        char[] M = scanner.nextLine().toCharArray();
    }

    private static int getresult(int[] child_need, int[] teacher_has) {
        Arrays.sort(child_need);
        Arrays.sort(teacher_has);
        int len = child_need.length;
        int count = 0;
        int res = 0;
        for (int i = 0; i < teacher_has.length; i++) {
            if(count>len-1)
                break;
            if(teacher_has[i]>=child_need[count]){
                res++;
                count++;
            }
        }
        return res;
    }

}

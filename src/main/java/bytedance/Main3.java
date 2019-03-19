package bytedance;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-16
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            int len = scanner.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j <len ; j++) {
                arr[j] = scanner.nextInt();
            }
            int ans = getresult(arr);
            System.out.println(ans);
        }
    }

    private static int getresult(int[] score) {
        int[] temp = score.clone();
        int len = score.length;
        int[] prize = new int[score.length];
        for (int i = 0; i <prize.length ; i++) {
            prize[i] = 1;
        }
        int min = 9999999;
        int index = 0;
        for (int i = 0; i <len ; i++) {
            if(score[i]<min)
                min = score[i];
                index = i;
        }
        int begin = 0;
        for (int i = index; i <len ; i++) {
            score[begin]=temp[i];
            begin++;
        }
        for (int i = 0; i <index ; i++) {
            score[begin]=temp[i];
            begin++;
        }
        if(score[0]>score[len-1]){
            prize[0]=prize[len-1]+1;
        }
        if(score[0]<score[len-1]){
            prize[len-1]=prize[0]+1;
        }
        for (int i = 1; i <prize.length ; i++) {
            if(score[i]>score[i-1]){
                prize[i]=prize[i-1]+1;
            }
        }
        for(int i=len-2;i>=0;i--){
            if(score[i]>score[i+1]){
                prize[i]=Math.max(prize[i],prize[i+1]+1);
            }
        }
        int ans = 0;
        for (int i = 0; i <len ; i++) {
            ans += prize[i];
        }
        return ans;
    }

}

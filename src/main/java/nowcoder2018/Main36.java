package nowcoder2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-08
 **/
public class Main36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        String[] strs = new String[n];
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++) strs[i] = scanner.next();
        for(int i=0; i<q; i++) {
            String[] str = strs.clone();
            int left = scanner.nextInt()-1;
            int right = scanner.nextInt()-1;
            int move = left;
            int score = 0;
            int step = 1;
            int l = 0;
            int r = 0;
            while(move>= left && move<=right) {
                
            }
            res.add(score);
        }
        for(Integer e: res) System.out.println(e);
    }

}

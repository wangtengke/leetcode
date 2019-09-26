package KickStart.RoundC.A;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-26
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            String ins = scanner.next();
            int [] res = solve(m,n,x0, y0, ins);
            System.out.println("Case #"+String.valueOf(i+1)+": "+String.valueOf(res[0])+" "+String.valueOf(res[1]));
        }
    }

    private static int[] solve(int m, int n, int x0, int y0, String ins) {
        boolean[][] map= new boolean[m+1][n+1];
        map[x0][y0] = true;
        for (int i = 0; i < ins.length(); i++) {
            int x = x0; int y = y0;
            if(ins.charAt(i)=='E'){
                while(y<=n&&map[x][y]){
                    y++;
                    if(y==n+1) break;
                }
                if(y==n+1 && map[x][n]){
                }
                else {
                    map[x][y] = true;
                    x0 = x;
                    y0 = y;
                }
            }
            else if(ins.charAt(i)=='W'){
                while(y>=1&&map[x][y]) {
                    y--;
                    if(y==0) break;
                }
                if(y==0 && map[x][1]){
                }
                else {
                    map[x][y] = true;
                    x0 = x;
                    y0 = y;
                }
            }
            else if(ins.charAt(i)=='N'){
                while(x>=1&&map[x][y]) {
                    x--;
                    if(x==0) break;
                }
                if(x==0 && map[1][y]){
                }
                else {
                    map[x][y] = true;
                    x0 = x;
                    y0 = y;
                }
            }
            else if(ins.charAt(i)=='S'){
                while(x<=m&&map[x][y]){
                    x++;
                    if(x==m+1) break;
                }
                if(x==m+1 && map[m][y]){
                }
                else {
                    map[x][y] = true;
                    x0 = x;
                    y0 = y;
                }
            }
//            System.out.println("x: "+ String.valueOf(x) +"--y: "+String.valueOf(y)+"----ins: "+ins.charAt(i));
        }
        return new int[]{x0, y0};
    }

}

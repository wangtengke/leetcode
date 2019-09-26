import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-01
 **/
public class CanMakePalindromefromSubstring {

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = queries.length;
        int[][] arr = new int[n][26];
        for(int i=0; i<s.length(); i++) {
            if(i>0) arr[i] = arr[i-1].clone();
            arr[i][s.charAt(i)-'a']++;
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(canMake(queries[i][0], queries[i][1], queries[i][2], arr));
        }
        return list;

    }

    public Boolean canMake(int l, int r, int k, int[][] arr) {
        int count = 0;
        for(int i=0; i<26; i++) {
            if(l==0) {
                if(arr[r][i]%2==1) count++;
            }
            else {
                if((arr[r][i] - arr[l-1][i])%2==1) count++;
            }
        }
        if((r-l+1)%2==0) {
            return count/2<=k;
        }
        else return(count-1)/2 <= k;
    }

    public static void main(String[] args) {
//        CanMakePalindromefromSubstring canMakePalindromefromSubstring = new CanMakePalindromefromSubstring();
//        canMakePalindromefromSubstring.canMakePaliQueries("abcda", new int[][]{{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}});
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = scanner.nextLine();
        System.out.println(s);
        System.out.println(ss);
    }
}

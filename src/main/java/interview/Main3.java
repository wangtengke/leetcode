package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-09
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputstr = scanner.nextLine();
        int ans = getresult(inputstr);
        System.out.println(ans);
    }

    private static int getresult(String inputstr) {
        char[] A = inputstr.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char a :A){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else {
                map.put(a,1);
            }
        }
        if(map.size()>2||map.size()==0)
            return 0;
        if(map.size()==1)
            return 1;
        return 2;
    }
}

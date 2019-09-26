package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-05
 **/
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();
        for(int i= left; i<= right; i++){
            String s = String.valueOf(i);
            boolean f = true;
            for(int j=0; j<s.length(); j++){
                System.out.println(s.charAt(j));
//                System.out.println(Integer.);;
                System.out.println(s.charAt(j)=='0');
                System.out.println(i % Integer.valueOf(s.charAt(j))!=0);
                System.out.println((int)(s.charAt(j))-'0');
                if(s.charAt(j)=='0' || (i % Integer.valueOf(s.charAt(j))!=0)){
                    f = false;
                    break;
                }
            }
            if(f) ans.add(i);

        }
        return ans;
    }

    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        selfDividingNumbers.selfDividingNumbers(1, 22);
//        String s = "";
//        s.startsWith()
    }

}

import java.util.Collections;

/**
 * @program: leetcode
 * @description:
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * @author: wangtengke
 * @create: 2018-12-11
 **/
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            int pop = x % 10;
            x = x/10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = pop + result*10;
        }
        return result;
//        int flag = 0;
//        if(x<0){
//            x = Math.abs(x);
//            flag = 1;
//        }
//        String s = String.valueOf(x);
//        StringBuffer sb = new StringBuffer(s);
//        sb.reverse();
//        long t = Long.valueOf(sb.toString());
//
//        if (flag ==1){
//            x = -x ;
//        }
//        if(t<Integer.MIN_VALUE || t>Integer.MAX_VALUE)
//            return 0;
//        else {
//            x = (int) t;
//        }
//        return x;
    }
}

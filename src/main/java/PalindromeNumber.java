import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program: leetcode
 * @description:
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * @author: wangtengke
 * @create: 2018-12-11
 **/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(x<0)
            return false;
        while (x != 0){
            int pop =x%10;
            x=x/10;
            arrayList.add(pop);
        }
        int begin=0;
        int end = arrayList.size();
        while(end>begin) {
            if (arrayList.get(begin) == arrayList.get(end-1)){
                end--;
                begin++;
            }
            else {
                return false;
            }
        }
        return true;
    }

}

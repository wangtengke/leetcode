package medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 *
 *
 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 * @author: wangtengke
 * @create: 2019-02-23
 **/
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if(digits.isEmpty())
            return ans;
        ans.add("");
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        while (ans.peek().length()!=digits.length()){
            String remove = ans.remove();
            char[] str = map[digits.charAt(remove.length())-'0'].toCharArray();
            for(char c : str){
                ans.add(remove+c);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LetterCombinationsofaPhoneNumber letterCombinationsofaPhoneNumber = new LetterCombinationsofaPhoneNumber();
        letterCombinationsofaPhoneNumber.letterCombinations("23");
    }
}

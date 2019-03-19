package contest.contest114;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 * Example 2:
 *
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
 * Example 3:
 *
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l'
 * @author: wangtengke
 * @create: 2019-03-06
 **/
public class VerifyinganAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        char[] orders = order.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <orders.length ; i++) {
            map.put(orders[i],i);
        }
        for (int i = 0; i <words.length-1 ; i++) {
            char[] pre = words[i].toCharArray();
            char[] last = words[i+1].toCharArray();
            int count = 0;
            int length = 0;
            if (pre.length>=last.length) {
                 length = last.length;
            }
            else{
                 length = pre.length;
            }
            for (int j = 0; j <length; j++) {
                if(map.get(pre[j])-map.get(last[j])>0)
                    return false;
                else if(map.get(pre[j])-map.get(last[j])==0)
                    count++;
                else break;
                if(count==length){
                    if(pre.length>last.length)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        VerifyinganAlienDictionary v = new VerifyinganAlienDictionary();
//         ["apple","app"]
//        "abcdefghijklmnopqrstuvwxyz"
        System.out.println(v.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
    }
}

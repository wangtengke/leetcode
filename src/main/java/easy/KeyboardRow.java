package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-20
 **/
public class KeyboardRow {
    public String[] findWords(String[] words) {
        char[] line1 = new char[]{'q','w','e','r','t','y','u','i','o','p'};
        char[] line2 = new char[]{'a','s','d','f','g','h','j','k','l'};
        char[] line3 = new char[]{'z','x','c','v','b','n','m'};
        List<String> res = new ArrayList<>();
        for(String s:words){
            if(check(s, line1)||check(s, line2)|| check(s, line3)) res.add(s);
        }
        int size = res.size();
        String[] ret = new String[size];
        for(int i=0; i<size; i++) ret[i] = res.remove(0);
        return ret;
    }

    public boolean check(String s, char[] line){
        for(int i=0; i<s.length(); i++){
            boolean flag = false;
            for (int j = 0; j < line.length; j++) {
                if(Character.toLowerCase(s.charAt(i))==line[j]) {
                    flag = true;
                }
            }
            if(!flag) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"} );
    }
}

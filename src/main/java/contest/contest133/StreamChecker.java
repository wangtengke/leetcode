package contest.contest133;

import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-25
 **/
public class StreamChecker {
    private String[] s;
    private StringBuilder sb = new StringBuilder();
    public StreamChecker(String[] words) {
        this.s = words;
    }

    public boolean query(char letter) {
        sb.append(letter);
        for(String ss: this.s){
            String word = new StringBuilder(ss).reverse().toString();
            String r = sb.reverse().toString();
            if(r.startsWith(word)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StreamChecker streamChecker = new StreamChecker(new String[]{"cd","f","kl"});
        streamChecker.query('a');          // return false
        streamChecker.query('b');          // return false
        streamChecker.query('c');          // return false
        streamChecker.query('d');          // return true, because 'cd' is in the wordlist
        streamChecker.query('e');          // return false
        streamChecker.query('f');          // return true, because 'f' is in the wordlist
        streamChecker.query('g');          // return false
        streamChecker.query('h');          // return false
        streamChecker.query('i');          // return false
        streamChecker.query('j');          // return false
        streamChecker.query('k');          // return false
        streamChecker.query('l');          // return true, because 'kl' is in the wordlist
    }

}

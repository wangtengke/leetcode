package PartitiontoKEqualSumSubsets;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-03
 **/
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new LinkedList<>();
        List<String> cur = new LinkedList<>();
        dfs(0, s, cur, list);
        return list;
    }

    public void dfs(int index, String s, List<String> cur, List<List<String>> list){
        if(index==s.length()){
            list.add(new LinkedList<>(cur));
//            cur.clear();
            return;
        }
        for(int i=index+1; i<=s.length(); i++){
            if(isvalid(s.substring(index,i))){
                cur.add(s.substring(index,i));
                dfs(i, s, cur, list);
                cur.remove(cur.size()-1);
            }
        }
    }

    public boolean isvalid(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        palindromePartitioning.partition("cdd");
    }
}

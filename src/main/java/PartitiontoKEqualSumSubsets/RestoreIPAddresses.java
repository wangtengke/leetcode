package PartitiontoKEqualSumSubsets;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-02
 **/
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new LinkedList<>();
//        list.get(list)
//        boolean ss = ((boolean) s.contains());
        String input = "123";
        new LinkedList<Integer>(Collections.singleton(Integer.valueOf(input)));
        String[] cur = new String[4];
        int size = s.length();
        dfs(0, 0, s, cur, list);
        return list;
    }

    public void dfs(int index, int len, String s, String[] cur, List<String> list){
        if(index==s.length() && len==4){
            String ss = "";
            for (int i = 0; i < cur.length-1; i++) {
                if(!String.valueOf(Integer.valueOf(cur[i])).equals(cur[i]))
                    return;
                ss = ss + cur[i] + ".";
            }
            if(!String.valueOf(Integer.valueOf(cur[cur.length-1])).equals(cur[cur.length-1]))
                return;
            ss = ss + cur[cur.length-1];
            list.add(ss);
            return;
        }
        if(index==s.length())
            return;
        if(len==4)
            return;
        String s1 = "";
        while(Integer.valueOf(s1 + s.charAt(index))<=255){
            s1 = s1 + s.charAt(index++);
            cur[len] = s1;
            dfs(index, len+1, s, cur, list);
            if(index==s.length())
                break;
        }
    }

    public static void main(String[] args) {
        RestoreIPAddresses  restoreIPAddresses = new RestoreIPAddresses();
        restoreIPAddresses.restoreIpAddresses("25525511135");

    }
}

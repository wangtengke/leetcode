package vmware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-25
 **/
public class StringPermutation {
    public ArrayList<String> Permutation(String str) {
//        char[] ch = str.toCharArray();
//        Arrays.sort(ch);
//        int n = str.length();
//        if(n==0) return new ArrayList<>();
//        String cur = "";
//        ArrayList<String> list = new ArrayList<>();
//        boolean[] visited = new boolean[n];
//        dfs(n, ch, cur, list, visited);
//        HashSet
//        list.addAll()
//        return list;
        return null;
    }

    public void dfs(int size, char[] ch, String cur, ArrayList<String> list, boolean[] visited){


        if(cur.length()==size && !list.contains(cur)){
            list.add(new String(cur));
            return;
        }

        for(int i=0; i<size; i++){
            if(visited[i]) continue;
            visited[i] = true;
            cur += ch[i];
            dfs(size, ch, cur, list, visited);
            cur= cur.substring(0, cur.length()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.Permutation("ab");
    }

}

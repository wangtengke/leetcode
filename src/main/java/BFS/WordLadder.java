package BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-27
 **/
public class WordLadder {
    public int ladderLength(String begin, String end, List<String> list) {
        Set<String> beginto = new HashSet<>();
        Set<String> endto = new HashSet<>();
        Set<String> visited = new HashSet<>();
        if(!list.contains(end)) return 0;
        visited.add(begin);
        beginto.add(begin);
        endto.add(end);
        int step = 1;
        while(!beginto.isEmpty()&&!endto.isEmpty()){
            Set<String> start = new HashSet<>();
            for(String b : beginto){
                for(int i=0; i<b.length(); i++){
                    char[] chars = b.toCharArray();
                    for(char ch='a'; ch<='z'; ch++){
                        chars[i] = ch;
                        String word = new String(chars);
                        if(endto.contains(word)){
                            step++;
                            return step;
                        }
                        if(list.contains(word)){
                            if(!visited.contains(word)){
                                visited.add(word);
                                start.add(word);
                            }

                        }

                    }

                }
            }
            beginto = start;
            if(beginto.size()>endto.size()){
                Set<String> temp = beginto;
                beginto = endto;
                endto = temp;
            }
            step++;
        }
        return 0;
    }

    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        wordLadder.ladderLength("hit", "cog",list);
    }

}

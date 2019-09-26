package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-27
 **/
public class WordSearchII {
    public List<String> list = new ArrayList<>();
    public boolean[][] used;
    public List<String> findWords(char[][] board, String[] words) {
        used = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                for(int k=0; k<words.length; k++){
                    dfs(i, j, board, words[k], 0);
                }
            }
        }
        return list;
    }

    public void dfs(int x, int y, char[][] board, String word, int index){
        if(x<0||y<0||x>=board.length||y>=board[0].length||used[x][y]||board[x][y]!=word.charAt(index))
            return;

        if(index == word.length()-1 && board[x][y]==word.charAt(index)){
            if(!list.contains(word))
                list.add(word);
            return;
        }

        used[x][y] = true;
        dfs(x+1, y, board, word, index+1);
        dfs(x-1, y, board, word, index+1);
        dfs(x, y+1, board, word, index+1);
        dfs(x, y-1, board, word, index+1);
        used[x][y] = false;
    }

}

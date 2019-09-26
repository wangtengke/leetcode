package DFS;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-27
 **/
public class WordSearch {
    public boolean[][] used ;
    public boolean exist(char[][] board, String word) {
        used = new boolean[board.length][board[0].length];
        boolean ans = false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                ans = ans || dfs(i, j, board, word, 0);
            }
        }
        return ans;
    }

    private boolean dfs(int x, int y, char[][] board, String word, int index) {
        if(x<0||y<0||x>=board.length||y>=board[0].length)
            return false;
        if(used[x][y]) {
            return false;
        }
        if(word.length()-1==index && board[x][y] == word.charAt(word.length()-1))
            return true;


        if(board[x][y] != word.charAt(index)){
            return false;
        }
        used[x][y] = true;
        if( dfs(x+1, y, board, word, index+1)||dfs(x-1, y, board, word, index+1)||dfs(x, y+1, board, word, index+1)||dfs(x, y-1, board, word, index+1))
            return true;
        used[x][y] = false;
        return false;
    }

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        wordSearch.exist(new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}}
        ,"ABCESEEEFS");
        //[["A","B","C","E"],["S","F","E","S"],["A","D","E","E"]]
        //"ABCESEEEFS"
    }

}

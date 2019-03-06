package contest.contest125;

/**
 * @program: leetcode
 * @description:
 * On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.
 *
 * The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops.
 *
 * Return the number of pawns the rook can capture in one move.
 * @author: wangtengke
 * @create: 2019-02-24
 **/
public class AvailableCapturesforRook {
    public int numRookCaptures(char[][] board) {
        int posx = -1;
        int posy = -1;
        int ans = 0;
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                if(board[i][j]=='R'){
                    posx = i;
                    posy = j;
                }
            }
        }
        for (int i = posx+1; i <8 ; i++) {
            if(board[i][posy]=='p'){
                ans++;
                break;
            }
            if(board[i][posy]=='B')
                break;
        }
        for (int i = posx-1; i >=0 ; i--) {
            if(board[i][posy]=='p'){
                ans++;
                break;
            }
            if(board[i][posy]=='B')
                break;
        }
        for (int i = posy+1; i <8 ; i++) {
            if(board[posx][i]=='p'){
                ans++;
                break;
            }
            if(board[posx][i]=='B')
                break;
        }
        for (int i = posy; i >=0 ; i--) {
            if(board[posx][i]=='p'){
                ans++;
                break;
            }
            if(board[posx][i]=='B')
                break;
        }
        return  ans;
    }
}

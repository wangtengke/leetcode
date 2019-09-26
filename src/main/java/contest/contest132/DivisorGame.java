package contest.contest132;

import java.util.HashSet;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-14
 **/
public class DivisorGame {
    public boolean divisorGame(int N) {
        if(N==2){
            return true;
        }

        for(int i=2; i<N; i++){
            if(N%i==0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DivisorGame divisorGame = new DivisorGame();
        divisorGame.divisorGame(5);
    }
}

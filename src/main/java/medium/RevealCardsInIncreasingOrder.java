package medium;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-15
 **/
public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i <deck.length-1; i++) {
            q.addFirst(deck[i]);
            Integer temp = q.removeLast();
            q.addFirst(temp);
        }
        q.add(deck[deck.length-1]);
        int[] res = new int[deck.length];
        for(int i=0; i< res.length; i++){
            res[i] = q.removeFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        RevealCardsInIncreasingOrder revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
        revealCardsInIncreasingOrder.deckRevealedIncreasing(new int[]{17,13,11,2,3,5,7});
    }

}

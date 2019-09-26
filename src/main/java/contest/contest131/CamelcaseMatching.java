package contest.contest131;

import medium.CanPlaceFlowers;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-07
 **/
public class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        LinkedList<Boolean> ret = new LinkedList<>();
        for (int i = 0; i < queries.length; i++) {
            int index = 0;
            int flag = 0;
            int end = 0;
            for (int j = 0; j <queries[i].length() ; j++) {
                if(end==0&&queries[i].charAt(j)==pattern.charAt(index)){
                    index++;
                    if(index==pattern.length())
                        end++;
                }
                else {
                    if(queries[i].charAt(j)<'a'||queries[i].charAt(j)>'z') {
                        ret.add(false);
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag==0) {
                if (index < pattern.length())
                    ret.add(false);
                else {
                    ret.add(true);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        CamelcaseMatching camelcaseMatching =new CamelcaseMatching();
        camelcaseMatching.camelMatch(new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"},"FoBaT");
    }

}

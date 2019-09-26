package medium;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-28
 **/
public class AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        char cur = 'a';
        int offset = 0;
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<target.length(); k++) {
            char next = target.charAt(k);
            int offset_next = (next-'a')%5;
            int offset_cur = (cur-'a')%5;
            while(cur-next!=0){
                // System.out.println("cur: "+cur + "  next: " + next);
                if(cur-next>0) {
                    while(cur - next - offset_cur + offset_next>=5 && cur - 5 -'a'>=0) {
                        sb.append("U");
                        cur = (char)(cur - 5);
                    }
                    // for(int i=0; i<((cur - next - offset_cur + offset_next)/5); i++) sb.append("U");
                }
                else {
                    while(next - cur - offset_next + offset_cur>=5 && cur + 5-'a'<=25) {
                        sb.append("D");
                        cur = (char) (cur + 5);
                        // System.out.println("cur: "+cur + "  next: " + next);
                    }
                }
                // for(int i=0; i<((next - cur - offset_next + offset_cur)/5); i++) sb.append("D");

                if(offset_cur>offset_next) {
                    while(offset_cur-offset_next>0 && cur-1-'a'>=0) {
                        sb.append("L");
                        cur = (char)(cur-1);
                    }
                    // for(int i=0; i<offset_cur-offset_next; i++) sb.append("L");
                }
                else {
                    while(offset_next-offset_cur>0 && cur+1-'a'<=25){
                        sb.append("R");
                        cur = (char)(cur+1);
                    }
                    // for(int i=0; i<offset_next-offset_cur; i++) sb.append("R");
                }
            }


            sb.append("!");
            cur = next;

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AlphabetBoardPath alphabetBoardPath = new AlphabetBoardPath();
        alphabetBoardPath.alphabetBoardPath("leet");
    }

}

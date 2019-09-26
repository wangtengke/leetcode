package easy;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-13
 **/
public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split(" ");
        for (int i = 0; i < ss.length/2; i++) {
            String temp = ss[i];
            ss[i] = ss[ss.length-i-1];
            ss[ss.length-i-1] = temp;
        }
        String cur = "";
        for (int i = 0; i < ss.length; i++) {
            if(cur=="") {
                cur += ss[i];
            }
            else
                cur = cur + " " + ss[i];
        }
        return cur;
    }

}

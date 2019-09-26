package easy;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-23
 **/
public class StringCompression {
    public int compress(char[] chars) {
//        Arrays.sort(chars);
        int count = 0;
        int index = -1;
        int inx = 0;
        for(int i=0; i<chars.length-1; i++){
            if(chars[i]==chars[i+1]) continue;
            if(i-index==1){
                // count++;
                // index = i;
                chars[inx++]=chars[i];
                count++;
                index = i;
            }
            else{
                // count +=2;
                // index = i;
                chars[inx++] = chars[i];
                char[] ch =  String.valueOf(i-index).toCharArray();
                for(char c: ch) chars[inx++] = c;
                // chars[inx++] = (char)(i-index+48);
                count = count + 1+ch.length;
                index = i;
            }
        }
        if(index==chars.length-2) {
            chars[inx++]=chars[chars.length-1];
            count++;
        }
        else{
            chars[inx++] = chars[chars.length-1];
            char[] ch =  String.valueOf(chars.length-1-index).toCharArray();
            for(char c: ch) chars[inx++] = c;
            count = count+ 1+ ch.length;
        }
        return count;
    }

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        stringCompression.compress(new char[]{'a','a','a','b','b','a','a'});
    }

}

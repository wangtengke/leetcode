package nowcoder2018;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-20
 **/
public class Main29 {
        public String PrintMinNumber(int [] numbers) {
            String[] str = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                str[i] = String.valueOf(numbers[i]);
            }
            Arrays.sort(str, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String s1 = o1 + o2;
                    String s2 = o2 + o1;
                    return s1.compareTo(s2);
                }
            });
            StringBuilder sb = new StringBuilder();
            for (String s : str) {
                sb.append(s);
            }
            return sb.toString();
        }
}

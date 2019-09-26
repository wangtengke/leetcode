package PartitiontoKEqualSumSubsets;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-04
 **/
public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> list = new LinkedList<>();
        return dfs(num, target, "", list, 0, 0, 0);
    }

    public List<String> dfs(String num, int target, String path, List<String> list, int index, long cur, long pre){
        if(index == num.length()&&cur==target){
            list.add(path);
            return list;
        }
        // if(index==num.l)
        for(int i=index; i<num.length(); i++){
            if(i>index && num.charAt(0)=='0') break;
            long ans = Long.parseLong(num.substring(index, i+1));
            if(index == 0){
                dfs(num, target, path + ans, list, i+1, ans, ans);
            }
            else{
                dfs(num, target, path + "+" +ans, list, i+1, cur + ans, ans);

                dfs(num, target, path + "-" +ans, list, i+1, cur - ans, -ans);

                dfs(num, target, path + "*" +ans, list, i+1, cur - pre + pre * ans, pre* ans);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        ExpressionAddOperators expressionAddOperators = new ExpressionAddOperators();
        expressionAddOperators.addOperators("123", 6);
    }

}

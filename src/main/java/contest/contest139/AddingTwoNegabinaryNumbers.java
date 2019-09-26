package contest.contest139;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-02
 **/
public class AddingTwoNegabinaryNumbers {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
            List list1 = Arrays.asList(arr1);
            List list2 = Arrays.asList(arr2);
            Collections.reverse(list1);
            Collections.reverse(list2);
            List<Integer> list = new LinkedList<>();
            int max = Math.max(list1.size(), list2.size());
        for (int i = 0; i < max; i++) {
            Integer n1 = (Integer) list1.get(i);
            Integer n2 = (Integer) list2.get(i);
            if(n1!=null && n2!=null){
                int temp = n1 + n2;
                list.add(temp);
            }
            else if(n1!=null){
                list.add(n1);
            }
            else {
                list.add(n2);
            }
        }
        int[] arr = new int[list.size()+2];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.remove(0);
        }
        return null;

    }

    public static void main(String[] args) {
        AddingTwoNegabinaryNumbers addingTwoNegabinaryNumbers = new AddingTwoNegabinaryNumbers();
        addingTwoNegabinaryNumbers.addNegabinary(new int[]{1}, new int[]{1});
//        StringBuilder sb = new StringBuilder();
    }

}

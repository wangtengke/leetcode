package List;

import util.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-16
 **/
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> list1 = new LinkedList<>();
        Deque<Integer> list2 = new LinkedList<>();
        while(l1!=null || l2!=null){
            if(l1!=null){
                list1.add(l1.val);
                l1 = l1.next;
            }
            if(l2!=null){
                list2.add(l2.val);
                l2 = l2.next;
            }
        }
        ListNode res = new ListNode(0);
        ListNode root = res;
        int val = 0;
        while(list1.size()!=0 || list2.size()!=0){
            if(list1.size()!=0){
                val += list1.pollLast();
            }
            if(list2.size()!=0){
                val += list2.pollLast();
            }
            int add = val/10;
            int value = val%10;
            root.next = new ListNode(value);
            val = add;
            root = root.next;
        }
        if(val==1)
            root.next = new ListNode(1);
        return res;

    }

}

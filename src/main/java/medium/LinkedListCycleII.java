package medium;

import util.ListNode;

import java.util.HashSet;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-14
 **/
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        if(head==null)
            return null;
        while (head!=null){
            if(set.contains(head)){
                return head;
            }
            else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
}

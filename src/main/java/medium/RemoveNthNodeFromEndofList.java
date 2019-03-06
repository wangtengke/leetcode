package medium;

import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 * @author: wangtengke
 * @create: 2019-02-23
 **/
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        ListNode res = new ListNode(1);
        res.next = first;
        while (n>0){
            second=second.next;
            n--;
        }
        if(second==null)
            return first.next;
        while (second.next!=null){
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return res.next;
    }
}

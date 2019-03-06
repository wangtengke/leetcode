package easy;

import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * @author: wangtengke
 * @create: 2019-02-23
 **/
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(1);
        ListNode res = ans;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                ans.next = l2;
                return res.next;
            }
            if (l2 == null) {
                ans.next = l1;
                return res.next;
            }
            if (l1.val < l2.val) {
                ans.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                ans.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            ans = ans.next;
        }
        return res.next;
    }
}

package easy;

import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * 反转链表
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * @author: wangtengke
 * @create: 2018-12-18
 **/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newlist = null;
        ListNode prelist = head;
        ListNode temp = null;
        while (prelist!=null){
            temp = prelist.next;//保留后面的节点
            prelist.next = newlist;//将当前节点倒置
            newlist = prelist;//将倒置完的部分赋值给newlist
            prelist = temp;//将后面没有倒置的节点给prelist

        }
        return newlist;

    }
}

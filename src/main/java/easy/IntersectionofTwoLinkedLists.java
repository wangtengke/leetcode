package easy;

import util.ListNode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * @author: wangtengke
 * @create: 2018-12-24
 **/
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new LinkedHashSet<>();
        while(headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        ListNode res = null;
        while (headB!=null){
            if(set.contains(headB)) {
                res = headB;
                break;
            }
            headB = headB.next;
        }
        return res;
    }
}

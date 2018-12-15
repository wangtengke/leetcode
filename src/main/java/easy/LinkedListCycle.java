package easy;

import util.ListNode;

import java.util.HashSet;

/**
 * @program: leetcode
 * @description:
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 *
 * @author: wangtengke
 * @create: 2018-12-14
 **/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
    public static void main(String[] agrs){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        LinkedListCycle listCycle = new LinkedListCycle();
        System.out.println(listCycle.hasCycle(node1));
    }
}

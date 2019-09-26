package test;


import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-21
 **/
public class Main6 {

    public ListNode reverse(ListNode current) {
        if (current == null || current.next == null) return current;
        ListNode nextNode = current.next;
        current.next = null;
        ListNode reverseRest = reverse(nextNode);
        nextNode.next = current;
        return reverseRest;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Main6 m  = new Main6();
        m.reverse(node1);
    }
}

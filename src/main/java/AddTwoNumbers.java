import java.util.HashSet;

/**
 * @program: leetcode
 * @description:
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @author: wangtengke
 * @create: 2018-12-11
 **/
public class AddTwoNumbers {
    static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode now = new ListNode(0);
        ListNode result = now;
        int temp = 0;
        while (l1 != null || l2 != null){
            if(l1 == null){
                result.val = l2.val +temp;
                l2 = l2.next;
            }
            else if(l2 == null){
                result.val = l1.val + temp;
                l1 = l1.next;
            }
            else {
                result.val = l1.val+l2.val +temp;
                l1 = l1.next;
                l2 = l2.next;
            }

            if(result.val/10 == 1){
                temp = 1;
                result.val %= 10;
            }
            else {
                temp = 0;
            }
            if(l1!=null || l2!=null) {
                result.next = new ListNode(0);
                result = result.next;
            }
        }
        if(temp == 1)
            result.next = new ListNode(1);
        return now;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(0);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next =l2;
//        l2.next =l3;
//        l4.next =l5;
         addTwoNumbers(l1,l4);
    }
}

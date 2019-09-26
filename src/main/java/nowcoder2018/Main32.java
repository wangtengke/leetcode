package nowcoder2018;

import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-11
 **/
public class Main32 {
    public ListNode deleteDuplication(ListNode head)
    {
        ListNode res = new ListNode(1);
        res.next = head;
        ListNode pre = null;
        while(head.next!=null) {
            if(head.val==head.next.val) {
                while(head.val==head.next.val) head = head.next;
                if(pre==null) pre = head.next;
                else pre.next = head.next;
            }
            pre = head;
            head = head.next;
        }
        return res.next;
    }

    public static void main(String[] args) {

    }

}
